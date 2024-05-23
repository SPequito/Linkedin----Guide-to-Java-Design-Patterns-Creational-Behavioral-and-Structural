package FactoryAbstract;

// 1----> create a new user interface after this create a red and blue factory
public interface UserInterfaceFactory{
    Button createButton();
    ScrollBar createScrollBar();
}