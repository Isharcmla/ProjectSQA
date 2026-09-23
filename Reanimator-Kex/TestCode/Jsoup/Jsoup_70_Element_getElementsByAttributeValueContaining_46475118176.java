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

public class Element_getElementsByAttributeValueContaining_46475118176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4896;
     Object term249844;
     Object term249840;

    public Element_getElementsByAttributeValueContaining_46475118176() {
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
        setBooleanField(term4897, term4897.getClass(), "isBlock", true);
        setBooleanField(term4897, term4897.getClass(), "formatAsBlock", false);
        setBooleanField(term4897, term4897.getClass(), "canContainInline", false);
        setBooleanField(term4897, term4897.getClass(), "empty", true);
        setBooleanField(term4897, term4897.getClass(), "selfClosing", true);
        setBooleanField(term4897, term4897.getClass(), "preserveWhitespace", false);
        setBooleanField(term4897, term4897.getClass(), "formList", false);
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
        ArrayList term249851 = new ArrayList();
        ((ArrayList) term249851).add((Object)null);
        ((ArrayList) term249851).add((Object)null);
        ((ArrayList) term249851).add((Object)null);
        ((ArrayList) term249851).add((Object)null);
        ((ArrayList) term249851).add((Object)null);
        ((ArrayList) term249851).add((Object)null);
        ((ArrayList) term249851).add((Object)null);
        ((ArrayList) term249851).add((Object)null);
        ((ArrayList) term249851).add((Object)null);
        term249844 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term249845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term249848 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term249849 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term249850 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term249853 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term249854 = (Object[]) newArray("java.lang.String", 0);
        Object[] term249855 = (Object[]) newArray("java.lang.String", 0);
        setField(term249845, term249845.getClass(), "tagName", "aWYOWZFyaX");
        setBooleanField(term249845, term249845.getClass(), "isBlock", true);
        setBooleanField(term249845, term249845.getClass(), "formatAsBlock", false);
        setBooleanField(term249845, term249845.getClass(), "canContainInline", false);
        setBooleanField(term249845, term249845.getClass(), "empty", true);
        setBooleanField(term249845, term249845.getClass(), "selfClosing", true);
        setBooleanField(term249845, term249845.getClass(), "preserveWhitespace", false);
        setBooleanField(term249845, term249845.getClass(), "formList", false);
        setBooleanField(term249845, term249845.getClass(), "formSubmit", true);
        setField(term249844, term249844.getClass(), "tag", term249845);
        setField(term249848, term249848.getClass(), "referent", null);
        setField(term249849, term249849.getClass(), "lock", term249850);
        setField(term249849, term249849.getClass(), "head", null);
        setLongField(term249849, term249849.getClass(), "queueLength", -1610676979013636850L);
        setField(term249848, term249848.getClass(), "queue", term249849);
        setField(term249848, term249848.getClass(), "next", null);
        setField(term249848, term249848.getClass(), "discovered", null);
        setField(term249844, term249844.getClass(), "shadowChildrenRef", term249848);
        setField(term249844, term249844.getClass(), "childNodes", term249851);
        setIntField(term249853, term249853.getClass(), "size", -2015854073);
        setField(term249853, term249853.getClass(), "keys", term249854);
        setField(term249853, term249853.getClass(), "vals", term249855);
        setField(term249844, term249844.getClass(), "attributes", term249853);
        setField(term249844, term249844.getClass(), "baseUri", "BRIVNtfUWU");
        setField(term249844, term249844.getClass(), "parentNode", null);
        setIntField(term249844, term249844.getClass(), "siblingIndex", 538259104);
        term249840 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term249841 = (Object[]) newArray("java.lang.Object", 0);
        setField(term249840, term249840.getClass(), "elementData", term249841);
        setIntField(term249840, term249840.getClass(), "size", 0);
        setIntField(term249840, term249840.getClass(), "modCount", 0);
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
        assertTrue(recursiveEquals(term4896, term249844));
        assertTrue(recursiveEquals(retValue, term249840));
    }

};


