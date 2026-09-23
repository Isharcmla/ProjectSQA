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

public class Element_indexInList_1725876682166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3937;
     Object term3984;
     Object term244191;
     Object term244205;

    public Element_indexInList_1725876682166() {
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
        setBooleanField(term3938, term3938.getClass(), "isBlock", true);
        setBooleanField(term3938, term3938.getClass(), "formatAsBlock", false);
        setBooleanField(term3938, term3938.getClass(), "canContainInline", false);
        setBooleanField(term3938, term3938.getClass(), "empty", true);
        setBooleanField(term3938, term3938.getClass(), "selfClosing", true);
        setBooleanField(term3938, term3938.getClass(), "preserveWhitespace", false);
        setBooleanField(term3938, term3938.getClass(), "formList", false);
        setBooleanField(term3938, term3938.getClass(), "formSubmit", false);
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
        ArrayList term244198 = new ArrayList();
        term244191 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term244192 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term244195 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term244196 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term244197 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term244200 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term244201 = (Object[]) newArray("java.lang.String", 0);
        Object[] term244202 = (Object[]) newArray("java.lang.String", 0);
        setField(term244192, term244192.getClass(), "tagName", "xIeFjkHkOe");
        setBooleanField(term244192, term244192.getClass(), "isBlock", true);
        setBooleanField(term244192, term244192.getClass(), "formatAsBlock", false);
        setBooleanField(term244192, term244192.getClass(), "canContainInline", false);
        setBooleanField(term244192, term244192.getClass(), "empty", true);
        setBooleanField(term244192, term244192.getClass(), "selfClosing", true);
        setBooleanField(term244192, term244192.getClass(), "preserveWhitespace", false);
        setBooleanField(term244192, term244192.getClass(), "formList", false);
        setBooleanField(term244192, term244192.getClass(), "formSubmit", false);
        setField(term244191, term244191.getClass(), "tag", term244192);
        setField(term244195, term244195.getClass(), "referent", null);
        setField(term244196, term244196.getClass(), "lock", term244197);
        setField(term244196, term244196.getClass(), "head", null);
        setLongField(term244196, term244196.getClass(), "queueLength", -2850532706972744550L);
        setField(term244195, term244195.getClass(), "queue", term244196);
        setField(term244195, term244195.getClass(), "next", null);
        setField(term244195, term244195.getClass(), "discovered", null);
        setField(term244191, term244191.getClass(), "shadowChildrenRef", term244195);
        setField(term244191, term244191.getClass(), "childNodes", term244198);
        setIntField(term244200, term244200.getClass(), "size", -341962980);
        setField(term244200, term244200.getClass(), "keys", term244201);
        setField(term244200, term244200.getClass(), "vals", term244202);
        setField(term244191, term244191.getClass(), "attributes", term244200);
        setField(term244191, term244191.getClass(), "baseUri", "SdCKLMIYnX");
        setField(term244191, term244191.getClass(), "parentNode", null);
        setIntField(term244191, term244191.getClass(), "siblingIndex", 1532716628);
        term244205 = new LinkedList();
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
        assertTrue(recursiveEquals(term3937, term244191));
        assertTrue(recursiveEquals(term3984, term244205));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


