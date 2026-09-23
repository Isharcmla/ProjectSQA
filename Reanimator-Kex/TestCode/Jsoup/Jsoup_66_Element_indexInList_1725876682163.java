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
import java.util.LinkedList;

public class Element_indexInList_1725876682163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3937;
     Object term3984;
     Object term25556;
     Object term25570;

    public Element_indexInList_1725876682163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3963 = new ArrayList();
        term3937 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3938 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3959 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3960 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3961 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3967 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3969 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3970 = (Object[]) newArray("java.lang.String", 0);
        setField(term3938, term3938.getClass(), "tagName", "xIeFjkHkOe");
        setBooleanField(term3938, term3938.getClass(), "isBlock", false);
        setBooleanField(term3938, term3938.getClass(), "formatAsBlock", false);
        setBooleanField(term3938, term3938.getClass(), "canContainInline", false);
        setBooleanField(term3938, term3938.getClass(), "empty", true);
        setBooleanField(term3938, term3938.getClass(), "selfClosing", false);
        setBooleanField(term3938, term3938.getClass(), "preserveWhitespace", false);
        setBooleanField(term3938, term3938.getClass(), "formList", true);
        setBooleanField(term3938, term3938.getClass(), "formSubmit", true);
        setField(term3937, term3937.getClass(), "tag", term3938);
        setField(term3959, term3959.getClass(), "referent", null);
        setField(term3960, term3960.getClass(), "lock", term3961);
        setField(term3960, term3960.getClass(), "head", null);
        setLongField(term3960, term3960.getClass(), "queueLength", -2850532706972744550L);
        setField(term3959, term3959.getClass(), "queue", term3960);
        setField(term3959, term3959.getClass(), "next", null);
        setField(term3959, term3959.getClass(), "discovered", null);
        setField(term3937, term3937.getClass(), "shadowChildrenRef", term3959);
        setField(term3937, term3937.getClass(), "childNodes", term3963);
        setIntField(term3967, term3967.getClass(), "size", -341962980);
        setField(term3967, term3967.getClass(), "keys", term3969);
        setField(term3967, term3967.getClass(), "vals", term3970);
        setField(term3937, term3937.getClass(), "attributes", term3967);
        setField(term3937, term3937.getClass(), "baseUri", "SdCKLMIYnX");
        setField(term3937, term3937.getClass(), "parentNode", null);
        setIntField(term3937, term3937.getClass(), "siblingIndex", 1532716628);
        term3984 = new LinkedList();
        ArrayList term25563 = new ArrayList();
        term25556 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25557 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25560 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term25561 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term25562 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term25565 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term25566 = (Object[]) newArray("java.lang.String", 0);
        Object[] term25567 = (Object[]) newArray("java.lang.String", 0);
        setField(term25557, term25557.getClass(), "tagName", "xIeFjkHkOe");
        setBooleanField(term25557, term25557.getClass(), "isBlock", false);
        setBooleanField(term25557, term25557.getClass(), "formatAsBlock", false);
        setBooleanField(term25557, term25557.getClass(), "canContainInline", false);
        setBooleanField(term25557, term25557.getClass(), "empty", true);
        setBooleanField(term25557, term25557.getClass(), "selfClosing", false);
        setBooleanField(term25557, term25557.getClass(), "preserveWhitespace", false);
        setBooleanField(term25557, term25557.getClass(), "formList", true);
        setBooleanField(term25557, term25557.getClass(), "formSubmit", true);
        setField(term25556, term25556.getClass(), "tag", term25557);
        setField(term25560, term25560.getClass(), "referent", null);
        setField(term25561, term25561.getClass(), "lock", term25562);
        setField(term25561, term25561.getClass(), "head", null);
        setLongField(term25561, term25561.getClass(), "queueLength", -2850532706972744550L);
        setField(term25560, term25560.getClass(), "queue", term25561);
        setField(term25560, term25560.getClass(), "next", null);
        setField(term25560, term25560.getClass(), "discovered", null);
        setField(term25556, term25556.getClass(), "shadowChildrenRef", term25560);
        setField(term25556, term25556.getClass(), "childNodes", term25563);
        setIntField(term25565, term25565.getClass(), "size", -341962980);
        setField(term25565, term25565.getClass(), "keys", term25566);
        setField(term25565, term25565.getClass(), "vals", term25567);
        setField(term25556, term25556.getClass(), "attributes", term25565);
        setField(term25556, term25556.getClass(), "baseUri", "SdCKLMIYnX");
        setField(term25556, term25556.getClass(), "parentNode", null);
        setIntField(term25556, term25556.getClass(), "siblingIndex", 1532716628);
        term25570 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term3937;
        args[1] = term3984;
        Object retValue = callMethod(klass, "indexInList", argTypes, null, args);
        assertTrue(recursiveEquals(term3937, term25556));
        assertTrue(recursiveEquals(term3984, term25570));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


