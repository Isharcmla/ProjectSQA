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

public class Element_classNames_77861729291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6971;

    public Element_classNames_77861729291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6997 = new ArrayList();
        ((ArrayList) term6997).add((Object)null);
        ((ArrayList) term6997).add((Object)null);
        ((ArrayList) term6997).add((Object)null);
        ((ArrayList) term6997).add((Object)null);
        ((ArrayList) term6997).add((Object)null);
        ((ArrayList) term6997).add((Object)null);
        ((ArrayList) term6997).add((Object)null);
        term6971 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6972 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6993 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6994 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6995 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7001 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7003 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7004 = (Object[]) newArray("java.lang.String", 0);
        setField(term6972, term6972.getClass(), "tagName", "WXMWFDGcLB");
        setBooleanField(term6972, term6972.getClass(), "isBlock", false);
        setBooleanField(term6972, term6972.getClass(), "formatAsBlock", true);
        setBooleanField(term6972, term6972.getClass(), "canContainInline", false);
        setBooleanField(term6972, term6972.getClass(), "empty", true);
        setBooleanField(term6972, term6972.getClass(), "selfClosing", true);
        setBooleanField(term6972, term6972.getClass(), "preserveWhitespace", true);
        setBooleanField(term6972, term6972.getClass(), "formList", false);
        setBooleanField(term6972, term6972.getClass(), "formSubmit", true);
        setField(term6971, term6971.getClass(), "tag", term6972);
        setField(term6993, term6993.getClass(), "referent", null);
        setField(term6994, term6994.getClass(), "lock", term6995);
        setField(term6994, term6994.getClass(), "head", null);
        setLongField(term6994, term6994.getClass(), "queueLength", -8652538484981166496L);
        setField(term6993, term6993.getClass(), "queue", term6994);
        setField(term6993, term6993.getClass(), "next", null);
        setField(term6993, term6993.getClass(), "discovered", null);
        setField(term6971, term6971.getClass(), "shadowChildrenRef", term6993);
        setField(term6971, term6971.getClass(), "childNodes", term6997);
        setIntField(term7001, term7001.getClass(), "size", 1320570890);
        setField(term7001, term7001.getClass(), "keys", term7003);
        setField(term7001, term7001.getClass(), "vals", term7004);
        setField(term6971, term6971.getClass(), "attributes", term7001);
        setField(term6971, term6971.getClass(), "baseUri", "wKWbJssZuG");
        setField(term6971, term6971.getClass(), "parentNode", null);
        setIntField(term6971, term6971.getClass(), "siblingIndex", -130649791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "classNames", argTypes, term6971, args);
    }

};


