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

public class Element_removeClass_11498692895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7290;

    public Element_removeClass_11498692895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7316 = new ArrayList();
        term7290 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7291 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7312 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7313 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7314 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7320 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7322 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7323 = (Object[]) newArray("java.lang.String", 0);
        setField(term7291, term7291.getClass(), "tagName", "HBGNxdNURv");
        setBooleanField(term7291, term7291.getClass(), "isBlock", false);
        setBooleanField(term7291, term7291.getClass(), "formatAsBlock", false);
        setBooleanField(term7291, term7291.getClass(), "canContainInline", false);
        setBooleanField(term7291, term7291.getClass(), "empty", false);
        setBooleanField(term7291, term7291.getClass(), "selfClosing", true);
        setBooleanField(term7291, term7291.getClass(), "preserveWhitespace", true);
        setBooleanField(term7291, term7291.getClass(), "formList", true);
        setBooleanField(term7291, term7291.getClass(), "formSubmit", true);
        setField(term7290, term7290.getClass(), "tag", term7291);
        setField(term7312, term7312.getClass(), "referent", null);
        setField(term7313, term7313.getClass(), "lock", term7314);
        setField(term7313, term7313.getClass(), "head", null);
        setLongField(term7313, term7313.getClass(), "queueLength", -8876856890348836498L);
        setField(term7312, term7312.getClass(), "queue", term7313);
        setField(term7312, term7312.getClass(), "next", null);
        setField(term7312, term7312.getClass(), "discovered", null);
        setField(term7290, term7290.getClass(), "shadowChildrenRef", term7312);
        setField(term7290, term7290.getClass(), "childNodes", term7316);
        setIntField(term7320, term7320.getClass(), "size", 1460722225);
        setField(term7320, term7320.getClass(), "keys", term7322);
        setField(term7320, term7320.getClass(), "vals", term7323);
        setField(term7290, term7290.getClass(), "attributes", term7320);
        setField(term7290, term7290.getClass(), "baseUri", "mfCpTPPQQm");
        setField(term7290, term7290.getClass(), "parentNode", null);
        setIntField(term7290, term7290.getClass(), "siblingIndex", 1743224434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OcJCIDNIXA";
        callMethod(klass, "removeClass", argTypes, term7290, args);
    }

};


