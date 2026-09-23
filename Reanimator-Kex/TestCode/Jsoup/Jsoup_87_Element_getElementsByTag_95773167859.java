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

public class Element_getElementsByTag_95773167859 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4210;

    public Element_getElementsByTag_95773167859() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4236 = new ArrayList();
        ((ArrayList) term4236).add((Object)null);
        ((ArrayList) term4236).add((Object)null);
        ((ArrayList) term4236).add((Object)null);
        ((ArrayList) term4236).add((Object)null);
        term4210 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4211 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4232 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4233 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4234 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4240 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4242 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4243 = (Object[]) newArray("java.lang.String", 0);
        setField(term4211, term4211.getClass(), "tagName", "wfaXBpWAUH");
        setBooleanField(term4211, term4211.getClass(), "isBlock", true);
        setBooleanField(term4211, term4211.getClass(), "formatAsBlock", false);
        setBooleanField(term4211, term4211.getClass(), "canContainInline", true);
        setBooleanField(term4211, term4211.getClass(), "empty", false);
        setBooleanField(term4211, term4211.getClass(), "selfClosing", true);
        setBooleanField(term4211, term4211.getClass(), "preserveWhitespace", false);
        setBooleanField(term4211, term4211.getClass(), "formList", false);
        setBooleanField(term4211, term4211.getClass(), "formSubmit", false);
        setField(term4210, term4210.getClass(), "tag", term4211);
        setField(term4232, term4232.getClass(), "referent", null);
        setField(term4233, term4233.getClass(), "lock", term4234);
        setField(term4233, term4233.getClass(), "head", null);
        setLongField(term4233, term4233.getClass(), "queueLength", 3825396310311739952L);
        setField(term4232, term4232.getClass(), "queue", term4233);
        setField(term4232, term4232.getClass(), "next", null);
        setField(term4232, term4232.getClass(), "discovered", null);
        setField(term4210, term4210.getClass(), "shadowChildrenRef", term4232);
        setField(term4210, term4210.getClass(), "childNodes", term4236);
        setIntField(term4240, term4240.getClass(), "size", 906181092);
        setField(term4240, term4240.getClass(), "keys", term4242);
        setField(term4240, term4240.getClass(), "vals", term4243);
        setField(term4210, term4210.getClass(), "attributes", term4240);
        setField(term4210, term4210.getClass(), "baseUri", "VMeAzAHwZj");
        setField(term4210, term4210.getClass(), "parentNode", null);
        setIntField(term4210, term4210.getClass(), "siblingIndex", 1045657203);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PznxWXsZME";
        callMethod(klass, "getElementsByTag", argTypes, term4210, args);
    }

};


