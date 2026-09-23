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

public class Element_removeClass_11498692899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7645;

    public Element_removeClass_11498692899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7671 = new ArrayList();
        ((ArrayList) term7671).add((Object)null);
        term7645 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7646 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7667 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7668 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7669 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7675 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7677 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7678 = (Object[]) newArray("java.lang.String", 0);
        setField(term7646, term7646.getClass(), "tagName", "iIRsCSYqXH");
        setBooleanField(term7646, term7646.getClass(), "isBlock", true);
        setBooleanField(term7646, term7646.getClass(), "formatAsBlock", false);
        setBooleanField(term7646, term7646.getClass(), "canContainInline", false);
        setBooleanField(term7646, term7646.getClass(), "empty", false);
        setBooleanField(term7646, term7646.getClass(), "selfClosing", false);
        setBooleanField(term7646, term7646.getClass(), "preserveWhitespace", true);
        setBooleanField(term7646, term7646.getClass(), "formList", true);
        setBooleanField(term7646, term7646.getClass(), "formSubmit", true);
        setField(term7645, term7645.getClass(), "tag", term7646);
        setField(term7667, term7667.getClass(), "referent", null);
        setField(term7668, term7668.getClass(), "lock", term7669);
        setField(term7668, term7668.getClass(), "head", null);
        setLongField(term7668, term7668.getClass(), "queueLength", -2177368829816872572L);
        setField(term7667, term7667.getClass(), "queue", term7668);
        setField(term7667, term7667.getClass(), "next", null);
        setField(term7667, term7667.getClass(), "discovered", null);
        setField(term7645, term7645.getClass(), "shadowChildrenRef", term7667);
        setField(term7645, term7645.getClass(), "childNodes", term7671);
        setIntField(term7675, term7675.getClass(), "size", 339372704);
        setField(term7675, term7675.getClass(), "keys", term7677);
        setField(term7675, term7675.getClass(), "vals", term7678);
        setField(term7645, term7645.getClass(), "attributes", term7675);
        setField(term7645, term7645.getClass(), "baseUri", "nghfqDXyCG");
        setField(term7645, term7645.getClass(), "parentNode", null);
        setIntField(term7645, term7645.getClass(), "siblingIndex", -851097944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WBAOTqErtm";
        callMethod(klass, "removeClass", argTypes, term7645, args);
    }

};


