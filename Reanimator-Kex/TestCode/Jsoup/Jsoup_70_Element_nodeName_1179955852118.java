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

public class Element_nodeName_1179955852118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term557;
     Object term56932;

    public Element_nodeName_1179955852118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term583 = new ArrayList();
        ((ArrayList) term583).add((Object)null);
        ((ArrayList) term583).add((Object)null);
        term557 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term558 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term579 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term580 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term581 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term587 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term589 = (Object[]) newArray("java.lang.String", 0);
        Object[] term590 = (Object[]) newArray("java.lang.String", 0);
        setField(term558, term558.getClass(), "tagName", "HyxfbSQYBe");
        setBooleanField(term558, term558.getClass(), "isBlock", false);
        setBooleanField(term558, term558.getClass(), "formatAsBlock", true);
        setBooleanField(term558, term558.getClass(), "canContainInline", true);
        setBooleanField(term558, term558.getClass(), "empty", true);
        setBooleanField(term558, term558.getClass(), "selfClosing", false);
        setBooleanField(term558, term558.getClass(), "preserveWhitespace", false);
        setBooleanField(term558, term558.getClass(), "formList", false);
        setBooleanField(term558, term558.getClass(), "formSubmit", false);
        setField(term557, term557.getClass(), "tag", term558);
        setField(term579, term579.getClass(), "referent", null);
        setField(term580, term580.getClass(), "lock", term581);
        setField(term580, term580.getClass(), "head", null);
        setLongField(term580, term580.getClass(), "queueLength", 4872422362414183754L);
        setField(term579, term579.getClass(), "queue", term580);
        setField(term579, term579.getClass(), "next", null);
        setField(term579, term579.getClass(), "discovered", null);
        setField(term557, term557.getClass(), "shadowChildrenRef", term579);
        setField(term557, term557.getClass(), "childNodes", term583);
        setIntField(term587, term587.getClass(), "size", -883034806);
        setField(term587, term587.getClass(), "keys", term589);
        setField(term587, term587.getClass(), "vals", term590);
        setField(term557, term557.getClass(), "attributes", term587);
        setField(term557, term557.getClass(), "baseUri", "pCTimMblYc");
        setField(term557, term557.getClass(), "parentNode", null);
        setIntField(term557, term557.getClass(), "siblingIndex", 1585847225);
        ArrayList term56939 = new ArrayList();
        ((ArrayList) term56939).add((Object)null);
        ((ArrayList) term56939).add((Object)null);
        term56932 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56933 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56936 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term56937 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term56938 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term56941 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56942 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56943 = (Object[]) newArray("java.lang.String", 0);
        setField(term56933, term56933.getClass(), "tagName", "HyxfbSQYBe");
        setBooleanField(term56933, term56933.getClass(), "isBlock", false);
        setBooleanField(term56933, term56933.getClass(), "formatAsBlock", true);
        setBooleanField(term56933, term56933.getClass(), "canContainInline", true);
        setBooleanField(term56933, term56933.getClass(), "empty", true);
        setBooleanField(term56933, term56933.getClass(), "selfClosing", false);
        setBooleanField(term56933, term56933.getClass(), "preserveWhitespace", false);
        setBooleanField(term56933, term56933.getClass(), "formList", false);
        setBooleanField(term56933, term56933.getClass(), "formSubmit", false);
        setField(term56932, term56932.getClass(), "tag", term56933);
        setField(term56936, term56936.getClass(), "referent", null);
        setField(term56937, term56937.getClass(), "lock", term56938);
        setField(term56937, term56937.getClass(), "head", null);
        setLongField(term56937, term56937.getClass(), "queueLength", 4872422362414183754L);
        setField(term56936, term56936.getClass(), "queue", term56937);
        setField(term56936, term56936.getClass(), "next", null);
        setField(term56936, term56936.getClass(), "discovered", null);
        setField(term56932, term56932.getClass(), "shadowChildrenRef", term56936);
        setField(term56932, term56932.getClass(), "childNodes", term56939);
        setIntField(term56941, term56941.getClass(), "size", -883034806);
        setField(term56941, term56941.getClass(), "keys", term56942);
        setField(term56941, term56941.getClass(), "vals", term56943);
        setField(term56932, term56932.getClass(), "attributes", term56941);
        setField(term56932, term56932.getClass(), "baseUri", "pCTimMblYc");
        setField(term56932, term56932.getClass(), "parentNode", null);
        setIntField(term56932, term56932.getClass(), "siblingIndex", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "nodeName", argTypes, term557, args);
        assertTrue(recursiveEquals(term557, term56932));
        assertTrue(recursiveEquals(retValue, "HyxfbSQYBe"));
    }

};


