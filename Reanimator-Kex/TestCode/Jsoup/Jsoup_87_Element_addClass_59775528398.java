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

public class Element_addClass_59775528398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7556;

    public Element_addClass_59775528398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7582 = new ArrayList();
        term7556 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7557 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7578 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7579 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7580 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7586 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7588 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7589 = (Object[]) newArray("java.lang.String", 0);
        setField(term7557, term7557.getClass(), "tagName", "ShIELyuULw");
        setBooleanField(term7557, term7557.getClass(), "isBlock", false);
        setBooleanField(term7557, term7557.getClass(), "formatAsBlock", false);
        setBooleanField(term7557, term7557.getClass(), "canContainInline", false);
        setBooleanField(term7557, term7557.getClass(), "empty", true);
        setBooleanField(term7557, term7557.getClass(), "selfClosing", true);
        setBooleanField(term7557, term7557.getClass(), "preserveWhitespace", false);
        setBooleanField(term7557, term7557.getClass(), "formList", true);
        setBooleanField(term7557, term7557.getClass(), "formSubmit", false);
        setField(term7556, term7556.getClass(), "tag", term7557);
        setField(term7578, term7578.getClass(), "referent", null);
        setField(term7579, term7579.getClass(), "lock", term7580);
        setField(term7579, term7579.getClass(), "head", null);
        setLongField(term7579, term7579.getClass(), "queueLength", 5836128569274066678L);
        setField(term7578, term7578.getClass(), "queue", term7579);
        setField(term7578, term7578.getClass(), "next", null);
        setField(term7578, term7578.getClass(), "discovered", null);
        setField(term7556, term7556.getClass(), "shadowChildrenRef", term7578);
        setField(term7556, term7556.getClass(), "childNodes", term7582);
        setIntField(term7586, term7586.getClass(), "size", -1015274146);
        setField(term7586, term7586.getClass(), "keys", term7588);
        setField(term7586, term7586.getClass(), "vals", term7589);
        setField(term7556, term7556.getClass(), "attributes", term7586);
        setField(term7556, term7556.getClass(), "baseUri", "IpQuOGMgmj");
        setField(term7556, term7556.getClass(), "parentNode", null);
        setIntField(term7556, term7556.getClass(), "siblingIndex", -49052672);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pJbnHTYrxn";
        callMethod(klass, "addClass", argTypes, term7556, args);
    }

};


