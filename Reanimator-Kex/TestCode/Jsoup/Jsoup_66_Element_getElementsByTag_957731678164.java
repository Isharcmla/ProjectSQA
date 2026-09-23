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

public class Element_getElementsByTag_957731678164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4007;
     Object term25960;
     Object term25956;

    public Element_getElementsByTag_957731678164() {
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
        setBooleanField(term4008, term4008.getClass(), "canContainInline", false);
        setBooleanField(term4008, term4008.getClass(), "empty", false);
        setBooleanField(term4008, term4008.getClass(), "selfClosing", false);
        setBooleanField(term4008, term4008.getClass(), "preserveWhitespace", true);
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
        ArrayList term25967 = new ArrayList();
        ((ArrayList) term25967).add((Object)null);
        term25960 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25961 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25964 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term25965 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term25966 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term25969 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term25970 = (Object[]) newArray("java.lang.String", 0);
        Object[] term25971 = (Object[]) newArray("java.lang.String", 0);
        setField(term25961, term25961.getClass(), "tagName", "OJJtVNPyKZ");
        setBooleanField(term25961, term25961.getClass(), "isBlock", false);
        setBooleanField(term25961, term25961.getClass(), "formatAsBlock", false);
        setBooleanField(term25961, term25961.getClass(), "canContainInline", false);
        setBooleanField(term25961, term25961.getClass(), "empty", false);
        setBooleanField(term25961, term25961.getClass(), "selfClosing", false);
        setBooleanField(term25961, term25961.getClass(), "preserveWhitespace", true);
        setBooleanField(term25961, term25961.getClass(), "formList", false);
        setBooleanField(term25961, term25961.getClass(), "formSubmit", true);
        setField(term25960, term25960.getClass(), "tag", term25961);
        setField(term25964, term25964.getClass(), "referent", null);
        setField(term25965, term25965.getClass(), "lock", term25966);
        setField(term25965, term25965.getClass(), "head", null);
        setLongField(term25965, term25965.getClass(), "queueLength", -2644215923136513282L);
        setField(term25964, term25964.getClass(), "queue", term25965);
        setField(term25964, term25964.getClass(), "next", null);
        setField(term25964, term25964.getClass(), "discovered", null);
        setField(term25960, term25960.getClass(), "shadowChildrenRef", term25964);
        setField(term25960, term25960.getClass(), "childNodes", term25967);
        setIntField(term25969, term25969.getClass(), "size", -1801760683);
        setField(term25969, term25969.getClass(), "keys", term25970);
        setField(term25969, term25969.getClass(), "vals", term25971);
        setField(term25960, term25960.getClass(), "attributes", term25969);
        setField(term25960, term25960.getClass(), "baseUri", "AKNapTAfmD");
        setField(term25960, term25960.getClass(), "parentNode", null);
        setIntField(term25960, term25960.getClass(), "siblingIndex", 1141317871);
        term25956 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term25957 = (Object[]) newArray("java.lang.Object", 0);
        setField(term25956, term25956.getClass(), "elementData", term25957);
        setIntField(term25956, term25956.getClass(), "size", 0);
        setIntField(term25956, term25956.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xJgPlLxpgC";
        Object retValue = callMethod(klass, "getElementsByTag", argTypes, term4007, args);
        assertTrue(recursiveEquals(term4007, term25960));
        assertTrue(recursiveEquals(retValue, term25956));
    }

};


