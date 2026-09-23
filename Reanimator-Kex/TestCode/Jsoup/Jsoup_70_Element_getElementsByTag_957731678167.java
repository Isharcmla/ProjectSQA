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

public class Element_getElementsByTag_957731678167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4007;
     Object term244595;
     Object term244591;

    public Element_getElementsByTag_957731678167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4033 = new ArrayList();
        ((ArrayList) term4033).add((Object)null);
        term4007 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4008 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4029 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4030 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4031 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4037 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4039 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4040 = (Object[]) newArray("java.lang.String", 0);
        setField(term4008, term4008.getClass(), "tagName", "OJJtVNPyKZ");
        setBooleanField(term4008, term4008.getClass(), "isBlock", false);
        setBooleanField(term4008, term4008.getClass(), "formatAsBlock", false);
        setBooleanField(term4008, term4008.getClass(), "canContainInline", true);
        setBooleanField(term4008, term4008.getClass(), "empty", false);
        setBooleanField(term4008, term4008.getClass(), "selfClosing", true);
        setBooleanField(term4008, term4008.getClass(), "preserveWhitespace", false);
        setBooleanField(term4008, term4008.getClass(), "formList", false);
        setBooleanField(term4008, term4008.getClass(), "formSubmit", true);
        setField(term4007, term4007.getClass(), "tag", term4008);
        setField(term4029, term4029.getClass(), "referent", null);
        setField(term4030, term4030.getClass(), "lock", term4031);
        setField(term4030, term4030.getClass(), "head", null);
        setLongField(term4030, term4030.getClass(), "queueLength", -2644215923136513282L);
        setField(term4029, term4029.getClass(), "queue", term4030);
        setField(term4029, term4029.getClass(), "next", null);
        setField(term4029, term4029.getClass(), "discovered", null);
        setField(term4007, term4007.getClass(), "shadowChildrenRef", term4029);
        setField(term4007, term4007.getClass(), "childNodes", term4033);
        setIntField(term4037, term4037.getClass(), "size", -1801760683);
        setField(term4037, term4037.getClass(), "keys", term4039);
        setField(term4037, term4037.getClass(), "vals", term4040);
        setField(term4007, term4007.getClass(), "attributes", term4037);
        setField(term4007, term4007.getClass(), "baseUri", "AKNapTAfmD");
        setField(term4007, term4007.getClass(), "parentNode", null);
        setIntField(term4007, term4007.getClass(), "siblingIndex", 1141317871);
        ArrayList term244602 = new ArrayList();
        ((ArrayList) term244602).add((Object)null);
        term244595 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term244596 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term244599 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term244600 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term244601 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term244604 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term244605 = (Object[]) newArray("java.lang.String", 0);
        Object[] term244606 = (Object[]) newArray("java.lang.String", 0);
        setField(term244596, term244596.getClass(), "tagName", "OJJtVNPyKZ");
        setBooleanField(term244596, term244596.getClass(), "isBlock", false);
        setBooleanField(term244596, term244596.getClass(), "formatAsBlock", false);
        setBooleanField(term244596, term244596.getClass(), "canContainInline", true);
        setBooleanField(term244596, term244596.getClass(), "empty", false);
        setBooleanField(term244596, term244596.getClass(), "selfClosing", true);
        setBooleanField(term244596, term244596.getClass(), "preserveWhitespace", false);
        setBooleanField(term244596, term244596.getClass(), "formList", false);
        setBooleanField(term244596, term244596.getClass(), "formSubmit", true);
        setField(term244595, term244595.getClass(), "tag", term244596);
        setField(term244599, term244599.getClass(), "referent", null);
        setField(term244600, term244600.getClass(), "lock", term244601);
        setField(term244600, term244600.getClass(), "head", null);
        setLongField(term244600, term244600.getClass(), "queueLength", -2644215923136513282L);
        setField(term244599, term244599.getClass(), "queue", term244600);
        setField(term244599, term244599.getClass(), "next", null);
        setField(term244599, term244599.getClass(), "discovered", null);
        setField(term244595, term244595.getClass(), "shadowChildrenRef", term244599);
        setField(term244595, term244595.getClass(), "childNodes", term244602);
        setIntField(term244604, term244604.getClass(), "size", -1801760683);
        setField(term244604, term244604.getClass(), "keys", term244605);
        setField(term244604, term244604.getClass(), "vals", term244606);
        setField(term244595, term244595.getClass(), "attributes", term244604);
        setField(term244595, term244595.getClass(), "baseUri", "AKNapTAfmD");
        setField(term244595, term244595.getClass(), "parentNode", null);
        setIntField(term244595, term244595.getClass(), "siblingIndex", 1141317871);
        term244591 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term244592 = (Object[]) newArray("java.lang.Object", 0);
        setField(term244591, term244591.getClass(), "elementData", term244592);
        setIntField(term244591, term244591.getClass(), "size", 0);
        setIntField(term244591, term244591.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        Object retValue = callMethod(klass, "getElementsByTag", argTypes, term4007, args);
        assertTrue(recursiveEquals(term4007, term244595));
        assertTrue(recursiveEquals(retValue, term244591));
    }

};


