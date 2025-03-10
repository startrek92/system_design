from abc import ABC, abstractmethod
from typing import List, Dict, Any

class Publisher(ABC):
    """Abstract class for publisher"""
    
    @abstractmethod
    def add(self, observer) -> bool:
        pass
    
    @abstractmethod
    def notify(self, changed_property: str = None):
        pass
    
    @abstractmethod
    def remove(self, observer) -> bool:
        pass


class Observer(ABC):
    """Observer class which will be called by publisher in case of any updates"""
    
    @abstractmethod
    def update(self, publisher: Publisher, changed_property: str = None):
        pass


class IphonePublisher(Publisher):
    def __init__(self):
        self._observers: List[Observer] = []
        self._data: Dict[str, Any] = {}
    
    def add(self, observer: Observer) -> bool:
        if observer not in self._observers:
            print(f'Observer added: {observer}')
            self._observers.append(observer)
            return True
        return False
    
    def remove(self, observer: Observer) -> bool:
        if observer in self._observers:
            self._observers.remove(observer)
            return True
        return False
    
    def set_data(self, key: str, value: Any):
        self._data[key] = value
        self.notify(key)
    
    def notify(self, changed_property: str = None):
        for obs in self._observers:
            obs.update(self, changed_property)
    
    @property
    def data(self):
        return self._data.copy()


class EmailNotifier(Observer):
    def update(self, publisher: Publisher, changed_property: str = None):
        if isinstance(publisher, IphonePublisher):
            if changed_property:
                print(f'Email notification: Property {changed_property} changed to {publisher.data.get(changed_property)}')
            else:
                print(f'Email notification: Data updated: {publisher.data}')


email_notifier = EmailNotifier()
iphone_publisher = IphonePublisher()
iphone_publisher.add(email_notifier)
iphone_publisher.set_data('price', 999)
iphone_publisher.set_data('stock', 90)