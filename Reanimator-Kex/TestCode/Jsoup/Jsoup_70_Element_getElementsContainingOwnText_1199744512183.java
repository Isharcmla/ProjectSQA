package org.jsoup.nodes;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Element_getElementsContainingOwnText_1199744512183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5603;
     Object term252908;
     Object term252904;

    public Element_getElementsContainingOwnText_1199744512183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5629 = new ArrayList();
        ((ArrayList) term5629).add((Object)null);
        ((ArrayList) term5629).add((Object)null);
        ((ArrayList) term5629).add((Object)null);
        term5603 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5604 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5625 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5626 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5627 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5633 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5635 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5636 = (Object[]) newArray("java.lang.String", 0);
        setField(term5604, term5604.getClass(), "tagName", "RbVQXSpxXy");
        setBooleanField(term5604, term5604.getClass(), "isBlock", false);
        setBooleanField(term5604, term5604.getClass(), "formatAsBlock", false);
        setBooleanField(term5604, term5604.getClass(), "canContainInline", false);
        setBooleanField(term5604, term5604.getClass(), "empty", true);
        setBooleanField(term5604, term5604.getClass(), "selfClosing", false);
        setBooleanField(term5604, term5604.getClass(), "preserveWhitespace", true);
        setBooleanField(term5604, term5604.getClass(), "formList", false);
        setBooleanField(term5604, term5604.getClass(), "formSubmit", true);
        setField(term5603, term5603.getClass(), "tag", term5604);
        setField(term5625, term5625.getClass(), "referent", null);
        setField(term5626, term5626.getClass(), "lock", term5627);
        setField(term5626, term5626.getClass(), "head", null);
        setLongField(term5626, term5626.getClass(), "queueLength", -5248475803419977214L);
        setField(term5625, term5625.getClass(), "queue", term5626);
        setField(term5625, term5625.getClass(), "next", null);
        setField(term5625, term5625.getClass(), "discovered", null);
        setField(term5603, term5603.getClass(), "shadowChildrenRef", term5625);
        setField(term5603, term5603.getClass(), "childNodes", term5629);
        setIntField(term5633, term5633.getClass(), "size", -461771056);
        setField(term5633, term5633.getClass(), "keys", term5635);
        setField(term5633, term5633.getClass(), "vals", term5636);
        setField(term5603, term5603.getClass(), "attributes", term5633);
        setField(term5603, term5603.getClass(), "baseUri", "YpJbIgJWWv");
        setField(term5603, term5603.getClass(), "parentNode", null);
        setIntField(term5603, term5603.getClass(), "siblingIndex", -243422082);
        ArrayList term252915 = new ArrayList();
        ((ArrayList) term252915).add((Object)null);
        ((ArrayList) term252915).add((Object)null);
        ((ArrayList) term252915).add((Object)null);
        term252908 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term252909 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term252912 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term252913 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term252914 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term252917 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term252918 = (Object[]) newArray("java.lang.String", 0);
        Object[] term252919 = (Object[]) newArray("java.lang.String", 0);
        setField(term252909, term252909.getClass(), "tagName", "RbVQXSpxXy");
        setBooleanField(term252909, term252909.getClass(), "isBlock", false);
        setBooleanField(term252909, term252909.getClass(), "formatAsBlock", false);
        setBooleanField(term252909, term252909.getClass(), "canContainInline", false);
        setBooleanField(term252909, term252909.getClass(), "empty", true);
        setBooleanField(term252909, term252909.getClass(), "selfClosing", false);
        setBooleanField(term252909, term252909.getClass(), "preserveWhitespace", true);
        setBooleanField(term252909, term252909.getClass(), "formList", false);
        setBooleanField(term252909, term252909.getClass(), "formSubmit", true);
        setField(term252908, term252908.getClass(), "tag", term252909);
        setField(term252912, term252912.getClass(), "referent", null);
        setField(term252913, term252913.getClass(), "lock", term252914);
        setField(term252913, term252913.getClass(), "head", null);
        setLongField(term252913, term252913.getClass(), "queueLength", -5248475803419977214L);
        setField(term252912, term252912.getClass(), "queue", term252913);
        setField(term252912, term252912.getClass(), "next", null);
        setField(term252912, term252912.getClass(), "discovered", null);
        setField(term252908, term252908.getClass(), "shadowChildrenRef", term252912);
        setField(term252908, term252908.getClass(), "childNodes", term252915);
        setIntField(term252917, term252917.getClass(), "size", -461771056);
        setField(term252917, term252917.getClass(), "keys", term252918);
        setField(term252917, term252917.getClass(), "vals", term252919);
        setField(term252908, term252908.getClass(), "attributes", term252917);
        setField(term252908, term252908.getClass(), "baseUri", "YpJbIgJWWv");
        setField(term252908, term252908.getClass(), "parentNode", null);
        setIntField(term252908, term252908.getClass(), "siblingIndex", -243422082);
        term252904 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term252905 = (Object[]) newArray("java.lang.Object", 0);
        setField(term252904, term252904.getClass(), "elementData", term252905);
        setIntField(term252904, term252904.getClass(), "size", 0);
        setIntField(term252904, term252904.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JppkknKVOw";
        Object retValue = callMethod(klass, "getElementsContainingOwnText", argTypes, term5603, args);
        assertTrue(recursiveEquals(term5603, term252908));
        assertTrue(recursiveEquals(retValue, term252904));
    }

};


