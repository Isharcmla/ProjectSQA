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
import java.util.LinkedList;

public class Element_indexInList_172587668258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4140;
     Object term4187;

    public Element_indexInList_172587668258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4166 = new ArrayList();
        ((ArrayList) term4166).add((Object)null);
        ((ArrayList) term4166).add((Object)null);
        term4140 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4141 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4162 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4163 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4164 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4170 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4172 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4173 = (Object[]) newArray("java.lang.String", 0);
        setField(term4141, term4141.getClass(), "tagName", "gCWtLVKVVe");
        setBooleanField(term4141, term4141.getClass(), "isBlock", false);
        setBooleanField(term4141, term4141.getClass(), "formatAsBlock", false);
        setBooleanField(term4141, term4141.getClass(), "canContainInline", true);
        setBooleanField(term4141, term4141.getClass(), "empty", true);
        setBooleanField(term4141, term4141.getClass(), "selfClosing", true);
        setBooleanField(term4141, term4141.getClass(), "preserveWhitespace", false);
        setBooleanField(term4141, term4141.getClass(), "formList", false);
        setBooleanField(term4141, term4141.getClass(), "formSubmit", true);
        setField(term4140, term4140.getClass(), "tag", term4141);
        setField(term4162, term4162.getClass(), "referent", null);
        setField(term4163, term4163.getClass(), "lock", term4164);
        setField(term4163, term4163.getClass(), "head", null);
        setLongField(term4163, term4163.getClass(), "queueLength", -7738503207562305297L);
        setField(term4162, term4162.getClass(), "queue", term4163);
        setField(term4162, term4162.getClass(), "next", null);
        setField(term4162, term4162.getClass(), "discovered", null);
        setField(term4140, term4140.getClass(), "shadowChildrenRef", term4162);
        setField(term4140, term4140.getClass(), "childNodes", term4166);
        setIntField(term4170, term4170.getClass(), "size", -893623680);
        setField(term4170, term4170.getClass(), "keys", term4172);
        setField(term4170, term4170.getClass(), "vals", term4173);
        setField(term4140, term4140.getClass(), "attributes", term4170);
        setField(term4140, term4140.getClass(), "baseUri", "fWKJoSoCwE");
        setField(term4140, term4140.getClass(), "parentNode", null);
        setIntField(term4140, term4140.getClass(), "siblingIndex", -1963434938);
        term4187 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term4140;
        args[1] = term4187;
        callMethod(klass, "indexInList", argTypes, null, args);
    }

};


