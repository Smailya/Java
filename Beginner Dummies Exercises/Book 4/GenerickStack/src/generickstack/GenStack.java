/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generickstack;

import java.util.LinkedList;

/**
 *
 * @author ISMAIL
 */
class GenStack<E> {
    {
private LinkedList<E> list = new LinkedList<E>(); 
public void push(E item) 
{
list.addFirst(item);
}
public E pop() 
{
return list.poll();
}
public E peek() 
{
return list.peek();
}
public boolean hasItems() 
{
return !list.isEmpty();
}
public int size() 
{
return list.size();
}
}
}
