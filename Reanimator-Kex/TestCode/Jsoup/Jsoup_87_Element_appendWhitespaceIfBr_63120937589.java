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

public class Element_appendWhitespaceIfBr_63120937589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6933;
     Object term6980;

    public Element_appendWhitespaceIfBr_63120937589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6959 = new ArrayList();
        ((ArrayList) term6959).add((Object)null);
        ((ArrayList) term6959).add((Object)null);
        ((ArrayList) term6959).add((Object)null);
        ((ArrayList) term6959).add((Object)null);
        ((ArrayList) term6959).add((Object)null);
        ((ArrayList) term6959).add((Object)null);
        ((ArrayList) term6959).add((Object)null);
        ((ArrayList) term6959).add((Object)null);
        ((ArrayList) term6959).add((Object)null);
        term6933 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6934 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6955 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6956 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6957 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6963 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6965 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6966 = (Object[]) newArray("java.lang.String", 0);
        setField(term6934, term6934.getClass(), "tagName", "SFqCrhEWLm");
        setBooleanField(term6934, term6934.getClass(), "isBlock", false);
        setBooleanField(term6934, term6934.getClass(), "formatAsBlock", false);
        setBooleanField(term6934, term6934.getClass(), "canContainInline", true);
        setBooleanField(term6934, term6934.getClass(), "empty", false);
        setBooleanField(term6934, term6934.getClass(), "selfClosing", false);
        setBooleanField(term6934, term6934.getClass(), "preserveWhitespace", true);
        setBooleanField(term6934, term6934.getClass(), "formList", false);
        setBooleanField(term6934, term6934.getClass(), "formSubmit", false);
        setField(term6933, term6933.getClass(), "tag", term6934);
        setField(term6955, term6955.getClass(), "referent", null);
        setField(term6956, term6956.getClass(), "lock", term6957);
        setField(term6956, term6956.getClass(), "head", null);
        setLongField(term6956, term6956.getClass(), "queueLength", 5946780097489996391L);
        setField(term6955, term6955.getClass(), "queue", term6956);
        setField(term6955, term6955.getClass(), "next", null);
        setField(term6955, term6955.getClass(), "discovered", null);
        setField(term6933, term6933.getClass(), "shadowChildrenRef", term6955);
        setField(term6933, term6933.getClass(), "childNodes", term6959);
        setIntField(term6963, term6963.getClass(), "size", -916335264);
        setField(term6963, term6963.getClass(), "keys", term6965);
        setField(term6963, term6963.getClass(), "vals", term6966);
        setField(term6933, term6933.getClass(), "attributes", term6963);
        setField(term6933, term6933.getClass(), "baseUri", "GZdcJyZntS");
        setField(term6933, term6933.getClass(), "parentNode", null);
        setIntField(term6933, term6933.getClass(), "siblingIndex", -919416536);
        term6980 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term6981 = (byte[]) newByteArray(16);
        setField(term6980, term6980.getClass(), "value", term6981);
        setByteField(term6980, term6980.getClass(), "coder", (byte) 89);
        setIntField(term6980, term6980.getClass(), "count", -43417861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[2];
        args[0] = term6933;
        args[1] = term6980;
        callMethod(klass, "appendWhitespaceIfBr", argTypes, null, args);
    }

};


