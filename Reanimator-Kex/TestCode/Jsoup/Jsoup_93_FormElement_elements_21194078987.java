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

public class FormElement_elements_21194078987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term886;
     Object term823;

    public FormElement_elements_21194078987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term122 = new ArrayList();
        ((ArrayList) term122).add((Object)null);
        ((ArrayList) term122).add((Object)null);
        ((ArrayList) term122).add((Object)null);
        ((ArrayList) term122).add((Object)null);
        term80 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term81 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term82 = (Object[]) newArray("java.lang.Object", 0);
        Object term85 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term118 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term119 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term120 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term126 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term128 = (Object[]) newArray("java.lang.String", 0);
        Object[] term129 = (Object[]) newArray("java.lang.String", 0);
        setField(term81, term81.getClass(), "elementData", term82);
        setIntField(term81, term81.getClass(), "size", 0);
        setIntField(term81, term81.getClass(), "modCount", 0);
        setField(term80, term80.getClass(), "elements", term81);
        setField(term85, term85.getClass(), "tagName", "xxtlPwDYFs");
        setField(term85, term85.getClass(), "normalName", "jJCZpVmanW");
        setBooleanField(term85, term85.getClass(), "isBlock", false);
        setBooleanField(term85, term85.getClass(), "formatAsBlock", true);
        setBooleanField(term85, term85.getClass(), "canContainInline", false);
        setBooleanField(term85, term85.getClass(), "empty", true);
        setBooleanField(term85, term85.getClass(), "selfClosing", false);
        setBooleanField(term85, term85.getClass(), "preserveWhitespace", true);
        setBooleanField(term85, term85.getClass(), "formList", false);
        setBooleanField(term85, term85.getClass(), "formSubmit", false);
        setField(term80, term80.getClass(), "tag", term85);
        setField(term118, term118.getClass(), "referent", null);
        setField(term119, term119.getClass(), "lock", term120);
        setField(term119, term119.getClass(), "head", null);
        setLongField(term119, term119.getClass(), "queueLength", 2442117782898005296L);
        setField(term118, term118.getClass(), "queue", term119);
        setField(term118, term118.getClass(), "next", null);
        setField(term118, term118.getClass(), "discovered", null);
        setField(term80, term80.getClass(), "shadowChildrenRef", term118);
        setField(term80, term80.getClass(), "childNodes", term122);
        setIntField(term126, term126.getClass(), "size", 1162663216);
        setField(term126, term126.getClass(), "keys", term128);
        setField(term126, term126.getClass(), "vals", term129);
        setField(term80, term80.getClass(), "attributes", term126);
        setField(term80, term80.getClass(), "baseUri", "EGtDIRbSSb");
        setField(term80, term80.getClass(), "parentNode", null);
        setIntField(term80, term80.getClass(), "siblingIndex", 1484323161);
        ArrayList term897 = new ArrayList();
        ((ArrayList) term897).add((Object)null);
        ((ArrayList) term897).add((Object)null);
        ((ArrayList) term897).add((Object)null);
        ((ArrayList) term897).add((Object)null);
        term886 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term887 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term888 = (Object[]) newArray("java.lang.Object", 0);
        Object term889 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term894 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term895 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term896 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term899 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term900 = (Object[]) newArray("java.lang.String", 0);
        Object[] term901 = (Object[]) newArray("java.lang.String", 0);
        setField(term887, term887.getClass(), "elementData", term888);
        setIntField(term887, term887.getClass(), "size", 0);
        setIntField(term887, term887.getClass(), "modCount", 0);
        setField(term886, term886.getClass(), "elements", term887);
        setField(term889, term889.getClass(), "tagName", "xxtlPwDYFs");
        setField(term889, term889.getClass(), "normalName", "jJCZpVmanW");
        setBooleanField(term889, term889.getClass(), "isBlock", false);
        setBooleanField(term889, term889.getClass(), "formatAsBlock", true);
        setBooleanField(term889, term889.getClass(), "canContainInline", false);
        setBooleanField(term889, term889.getClass(), "empty", true);
        setBooleanField(term889, term889.getClass(), "selfClosing", false);
        setBooleanField(term889, term889.getClass(), "preserveWhitespace", true);
        setBooleanField(term889, term889.getClass(), "formList", false);
        setBooleanField(term889, term889.getClass(), "formSubmit", false);
        setField(term886, term886.getClass(), "tag", term889);
        setField(term894, term894.getClass(), "referent", null);
        setField(term895, term895.getClass(), "lock", term896);
        setField(term895, term895.getClass(), "head", null);
        setLongField(term895, term895.getClass(), "queueLength", 2442117782898005296L);
        setField(term894, term894.getClass(), "queue", term895);
        setField(term894, term894.getClass(), "next", null);
        setField(term894, term894.getClass(), "discovered", null);
        setField(term886, term886.getClass(), "shadowChildrenRef", term894);
        setField(term886, term886.getClass(), "childNodes", term897);
        setIntField(term899, term899.getClass(), "size", 1162663216);
        setField(term899, term899.getClass(), "keys", term900);
        setField(term899, term899.getClass(), "vals", term901);
        setField(term886, term886.getClass(), "attributes", term899);
        setField(term886, term886.getClass(), "baseUri", "EGtDIRbSSb");
        setField(term886, term886.getClass(), "parentNode", null);
        setIntField(term886, term886.getClass(), "siblingIndex", 1484323161);
        term823 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term824 = (Object[]) newArray("java.lang.Object", 0);
        setField(term823, term823.getClass(), "elementData", term824);
        setIntField(term823, term823.getClass(), "size", 0);
        setIntField(term823, term823.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "elements", argTypes, term80, args);
        assertTrue(recursiveEquals(term80, term886));
        assertTrue(recursiveEquals(retValue, term823));
    }

};


