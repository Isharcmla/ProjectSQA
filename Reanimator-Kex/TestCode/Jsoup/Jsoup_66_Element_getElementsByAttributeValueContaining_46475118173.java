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

public class Element_getElementsByAttributeValueContaining_46475118173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4896;
     Object term30822;
     Object term30818;

    public Element_getElementsByAttributeValueContaining_46475118173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4922 = new ArrayList();
        ((ArrayList) term4922).add((Object)null);
        ((ArrayList) term4922).add((Object)null);
        ((ArrayList) term4922).add((Object)null);
        ((ArrayList) term4922).add((Object)null);
        ((ArrayList) term4922).add((Object)null);
        ((ArrayList) term4922).add((Object)null);
        ((ArrayList) term4922).add((Object)null);
        ((ArrayList) term4922).add((Object)null);
        ((ArrayList) term4922).add((Object)null);
        term4896 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4897 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4918 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4919 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4920 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4926 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4928 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4929 = (Object[]) newArray("java.lang.String", 0);
        setField(term4897, term4897.getClass(), "tagName", "aWYOWZFyaX");
        setBooleanField(term4897, term4897.getClass(), "isBlock", false);
        setBooleanField(term4897, term4897.getClass(), "formatAsBlock", false);
        setBooleanField(term4897, term4897.getClass(), "canContainInline", false);
        setBooleanField(term4897, term4897.getClass(), "empty", true);
        setBooleanField(term4897, term4897.getClass(), "selfClosing", false);
        setBooleanField(term4897, term4897.getClass(), "preserveWhitespace", false);
        setBooleanField(term4897, term4897.getClass(), "formList", true);
        setBooleanField(term4897, term4897.getClass(), "formSubmit", true);
        setField(term4896, term4896.getClass(), "tag", term4897);
        setField(term4918, term4918.getClass(), "referent", null);
        setField(term4919, term4919.getClass(), "lock", term4920);
        setField(term4919, term4919.getClass(), "head", null);
        setLongField(term4919, term4919.getClass(), "queueLength", -1610676979013636850L);
        setField(term4918, term4918.getClass(), "queue", term4919);
        setField(term4918, term4918.getClass(), "next", null);
        setField(term4918, term4918.getClass(), "discovered", null);
        setField(term4896, term4896.getClass(), "shadowChildrenRef", term4918);
        setField(term4896, term4896.getClass(), "childNodes", term4922);
        setIntField(term4926, term4926.getClass(), "size", -2015854073);
        setField(term4926, term4926.getClass(), "keys", term4928);
        setField(term4926, term4926.getClass(), "vals", term4929);
        setField(term4896, term4896.getClass(), "attributes", term4926);
        setField(term4896, term4896.getClass(), "baseUri", "BRIVNtfUWU");
        setField(term4896, term4896.getClass(), "parentNode", null);
        setIntField(term4896, term4896.getClass(), "siblingIndex", 538259104);
        ArrayList term30829 = new ArrayList();
        ((ArrayList) term30829).add((Object)null);
        ((ArrayList) term30829).add((Object)null);
        ((ArrayList) term30829).add((Object)null);
        ((ArrayList) term30829).add((Object)null);
        ((ArrayList) term30829).add((Object)null);
        ((ArrayList) term30829).add((Object)null);
        ((ArrayList) term30829).add((Object)null);
        ((ArrayList) term30829).add((Object)null);
        ((ArrayList) term30829).add((Object)null);
        term30822 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term30823 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term30826 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term30827 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term30828 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term30831 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term30832 = (Object[]) newArray("java.lang.String", 0);
        Object[] term30833 = (Object[]) newArray("java.lang.String", 0);
        setField(term30823, term30823.getClass(), "tagName", "aWYOWZFyaX");
        setBooleanField(term30823, term30823.getClass(), "isBlock", false);
        setBooleanField(term30823, term30823.getClass(), "formatAsBlock", false);
        setBooleanField(term30823, term30823.getClass(), "canContainInline", false);
        setBooleanField(term30823, term30823.getClass(), "empty", true);
        setBooleanField(term30823, term30823.getClass(), "selfClosing", false);
        setBooleanField(term30823, term30823.getClass(), "preserveWhitespace", false);
        setBooleanField(term30823, term30823.getClass(), "formList", true);
        setBooleanField(term30823, term30823.getClass(), "formSubmit", true);
        setField(term30822, term30822.getClass(), "tag", term30823);
        setField(term30826, term30826.getClass(), "referent", null);
        setField(term30827, term30827.getClass(), "lock", term30828);
        setField(term30827, term30827.getClass(), "head", null);
        setLongField(term30827, term30827.getClass(), "queueLength", -1610676979013636850L);
        setField(term30826, term30826.getClass(), "queue", term30827);
        setField(term30826, term30826.getClass(), "next", null);
        setField(term30826, term30826.getClass(), "discovered", null);
        setField(term30822, term30822.getClass(), "shadowChildrenRef", term30826);
        setField(term30822, term30822.getClass(), "childNodes", term30829);
        setIntField(term30831, term30831.getClass(), "size", -2015854073);
        setField(term30831, term30831.getClass(), "keys", term30832);
        setField(term30831, term30831.getClass(), "vals", term30833);
        setField(term30822, term30822.getClass(), "attributes", term30831);
        setField(term30822, term30822.getClass(), "baseUri", "BRIVNtfUWU");
        setField(term30822, term30822.getClass(), "parentNode", null);
        setIntField(term30822, term30822.getClass(), "siblingIndex", 538259104);
        term30818 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term30819 = (Object[]) newArray("java.lang.Object", 0);
        setField(term30818, term30818.getClass(), "elementData", term30819);
        setIntField(term30818, term30818.getClass(), "size", 0);
        setIntField(term30818, term30818.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "DbiCVtPPCT";
        args[1] = "WzFopsaDuG";
        Object retValue = callMethod(klass, "getElementsByAttributeValueContaining", argTypes, term4896, args);
        assertTrue(recursiveEquals(term4896, term30822));
        assertTrue(recursiveEquals(retValue, term30818));
    }

};


