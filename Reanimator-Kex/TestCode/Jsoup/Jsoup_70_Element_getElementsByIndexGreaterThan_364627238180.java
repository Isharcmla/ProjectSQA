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
import java.lang.Integer;

public class Element_getElementsByIndexGreaterThan_364627238180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5376;
     Object term5423;
     Object term251753;
     Object term251749;

    public Element_getElementsByIndexGreaterThan_364627238180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5402 = new ArrayList();
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        ((ArrayList) term5402).add((Object)null);
        term5376 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5377 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5398 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5399 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5400 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5406 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5408 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5409 = (Object[]) newArray("java.lang.String", 0);
        setField(term5377, term5377.getClass(), "tagName", "JmcmxoGhIK");
        setBooleanField(term5377, term5377.getClass(), "isBlock", false);
        setBooleanField(term5377, term5377.getClass(), "formatAsBlock", false);
        setBooleanField(term5377, term5377.getClass(), "canContainInline", true);
        setBooleanField(term5377, term5377.getClass(), "empty", true);
        setBooleanField(term5377, term5377.getClass(), "selfClosing", true);
        setBooleanField(term5377, term5377.getClass(), "preserveWhitespace", true);
        setBooleanField(term5377, term5377.getClass(), "formList", false);
        setBooleanField(term5377, term5377.getClass(), "formSubmit", false);
        setField(term5376, term5376.getClass(), "tag", term5377);
        setField(term5398, term5398.getClass(), "referent", null);
        setField(term5399, term5399.getClass(), "lock", term5400);
        setField(term5399, term5399.getClass(), "head", null);
        setLongField(term5399, term5399.getClass(), "queueLength", 463622836963501975L);
        setField(term5398, term5398.getClass(), "queue", term5399);
        setField(term5398, term5398.getClass(), "next", null);
        setField(term5398, term5398.getClass(), "discovered", null);
        setField(term5376, term5376.getClass(), "shadowChildrenRef", term5398);
        setField(term5376, term5376.getClass(), "childNodes", term5402);
        setIntField(term5406, term5406.getClass(), "size", 1830648570);
        setField(term5406, term5406.getClass(), "keys", term5408);
        setField(term5406, term5406.getClass(), "vals", term5409);
        setField(term5376, term5376.getClass(), "attributes", term5406);
        setField(term5376, term5376.getClass(), "baseUri", "jXzmYyrnnT");
        setField(term5376, term5376.getClass(), "parentNode", null);
        setIntField(term5376, term5376.getClass(), "siblingIndex", -227365013);
        term5423 = new Integer(11724947);
        ArrayList term251760 = new ArrayList();
        ((ArrayList) term251760).add((Object)null);
        ((ArrayList) term251760).add((Object)null);
        ((ArrayList) term251760).add((Object)null);
        ((ArrayList) term251760).add((Object)null);
        ((ArrayList) term251760).add((Object)null);
        ((ArrayList) term251760).add((Object)null);
        ((ArrayList) term251760).add((Object)null);
        term251753 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term251754 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term251757 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term251758 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term251759 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term251762 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term251763 = (Object[]) newArray("java.lang.String", 0);
        Object[] term251764 = (Object[]) newArray("java.lang.String", 0);
        setField(term251754, term251754.getClass(), "tagName", "JmcmxoGhIK");
        setBooleanField(term251754, term251754.getClass(), "isBlock", false);
        setBooleanField(term251754, term251754.getClass(), "formatAsBlock", false);
        setBooleanField(term251754, term251754.getClass(), "canContainInline", true);
        setBooleanField(term251754, term251754.getClass(), "empty", true);
        setBooleanField(term251754, term251754.getClass(), "selfClosing", true);
        setBooleanField(term251754, term251754.getClass(), "preserveWhitespace", true);
        setBooleanField(term251754, term251754.getClass(), "formList", false);
        setBooleanField(term251754, term251754.getClass(), "formSubmit", false);
        setField(term251753, term251753.getClass(), "tag", term251754);
        setField(term251757, term251757.getClass(), "referent", null);
        setField(term251758, term251758.getClass(), "lock", term251759);
        setField(term251758, term251758.getClass(), "head", null);
        setLongField(term251758, term251758.getClass(), "queueLength", 463622836963501975L);
        setField(term251757, term251757.getClass(), "queue", term251758);
        setField(term251757, term251757.getClass(), "next", null);
        setField(term251757, term251757.getClass(), "discovered", null);
        setField(term251753, term251753.getClass(), "shadowChildrenRef", term251757);
        setField(term251753, term251753.getClass(), "childNodes", term251760);
        setIntField(term251762, term251762.getClass(), "size", 1830648570);
        setField(term251762, term251762.getClass(), "keys", term251763);
        setField(term251762, term251762.getClass(), "vals", term251764);
        setField(term251753, term251753.getClass(), "attributes", term251762);
        setField(term251753, term251753.getClass(), "baseUri", "jXzmYyrnnT");
        setField(term251753, term251753.getClass(), "parentNode", null);
        setIntField(term251753, term251753.getClass(), "siblingIndex", -227365013);
        term251749 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term251750 = (Object[]) newArray("java.lang.Object", 0);
        setField(term251749, term251749.getClass(), "elementData", term251750);
        setIntField(term251749, term251749.getClass(), "size", 0);
        setIntField(term251749, term251749.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5423;
        Object retValue = callMethod(klass, "getElementsByIndexGreaterThan", argTypes, term5376, args);
        assertTrue(recursiveEquals(term5376, term251753));
        assertTrue(recursiveEquals(term5423, 11724947));
        assertTrue(recursiveEquals(retValue, term251749));
    }

};


