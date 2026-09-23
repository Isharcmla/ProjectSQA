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
import java.lang.Object;
import java.util.ArrayList;

public class Element_elementSiblingIndex_58353445856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4006;

    public Element_elementSiblingIndex_58353445856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4032 = new ArrayList();
        ((ArrayList) term4032).add((Object)null);
        ((ArrayList) term4032).add((Object)null);
        term4006 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4007 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4028 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4029 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4030 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4036 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4038 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4039 = (Object[]) newArray("java.lang.String", 0);
        setField(term4007, term4007.getClass(), "tagName", "OJJtVNPyKZ");
        setBooleanField(term4007, term4007.getClass(), "isBlock", false);
        setBooleanField(term4007, term4007.getClass(), "formatAsBlock", false);
        setBooleanField(term4007, term4007.getClass(), "canContainInline", false);
        setBooleanField(term4007, term4007.getClass(), "empty", false);
        setBooleanField(term4007, term4007.getClass(), "selfClosing", false);
        setBooleanField(term4007, term4007.getClass(), "preserveWhitespace", true);
        setBooleanField(term4007, term4007.getClass(), "formList", false);
        setBooleanField(term4007, term4007.getClass(), "formSubmit", true);
        setField(term4006, term4006.getClass(), "tag", term4007);
        setField(term4028, term4028.getClass(), "referent", null);
        setField(term4029, term4029.getClass(), "lock", term4030);
        setField(term4029, term4029.getClass(), "head", null);
        setLongField(term4029, term4029.getClass(), "queueLength", -2644215923136513282L);
        setField(term4028, term4028.getClass(), "queue", term4029);
        setField(term4028, term4028.getClass(), "next", null);
        setField(term4028, term4028.getClass(), "discovered", null);
        setField(term4006, term4006.getClass(), "shadowChildrenRef", term4028);
        setField(term4006, term4006.getClass(), "childNodes", term4032);
        setIntField(term4036, term4036.getClass(), "size", -1801760683);
        setField(term4036, term4036.getClass(), "keys", term4038);
        setField(term4036, term4036.getClass(), "vals", term4039);
        setField(term4006, term4006.getClass(), "attributes", term4036);
        setField(term4006, term4006.getClass(), "baseUri", "AKNapTAfmD");
        setField(term4006, term4006.getClass(), "parentNode", null);
        setIntField(term4006, term4006.getClass(), "siblingIndex", 1141317871);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "elementSiblingIndex", argTypes, term4006, args);
    }

};


