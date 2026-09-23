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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Element_classNames_38379742596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7393;
     Object term7440;

    public Element_classNames_38379742596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7419 = new ArrayList();
        term7393 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7394 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7415 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7416 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7417 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7423 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7425 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7426 = (Object[]) newArray("java.lang.String", 0);
        setField(term7394, term7394.getClass(), "tagName", "HBGNxdNURv");
        setBooleanField(term7394, term7394.getClass(), "isBlock", false);
        setBooleanField(term7394, term7394.getClass(), "formatAsBlock", false);
        setBooleanField(term7394, term7394.getClass(), "canContainInline", true);
        setBooleanField(term7394, term7394.getClass(), "empty", true);
        setBooleanField(term7394, term7394.getClass(), "selfClosing", true);
        setBooleanField(term7394, term7394.getClass(), "preserveWhitespace", true);
        setBooleanField(term7394, term7394.getClass(), "formList", false);
        setBooleanField(term7394, term7394.getClass(), "formSubmit", true);
        setField(term7393, term7393.getClass(), "tag", term7394);
        setField(term7415, term7415.getClass(), "referent", null);
        setField(term7416, term7416.getClass(), "lock", term7417);
        setField(term7416, term7416.getClass(), "head", null);
        setLongField(term7416, term7416.getClass(), "queueLength", 846579494941632714L);
        setField(term7415, term7415.getClass(), "queue", term7416);
        setField(term7415, term7415.getClass(), "next", null);
        setField(term7415, term7415.getClass(), "discovered", null);
        setField(term7393, term7393.getClass(), "shadowChildrenRef", term7415);
        setField(term7393, term7393.getClass(), "childNodes", term7419);
        setIntField(term7423, term7423.getClass(), "size", 1252951645);
        setField(term7423, term7423.getClass(), "keys", term7425);
        setField(term7423, term7423.getClass(), "vals", term7426);
        setField(term7393, term7393.getClass(), "attributes", term7423);
        setField(term7393, term7393.getClass(), "baseUri", "mfCpTPPQQm");
        setField(term7393, term7393.getClass(), "parentNode", null);
        setIntField(term7393, term7393.getClass(), "siblingIndex", 574481092);
        HashMap term7441 = new HashMap();
        Set<Object> term7466 =  ((Map) term7441).keySet();
        term7440 = new HashSet((Collection<? extends Object>) term7466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term7440;
        callMethod(klass, "classNames", argTypes, term7393, args);
    }

};


