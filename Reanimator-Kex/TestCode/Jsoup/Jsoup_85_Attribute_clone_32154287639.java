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

public class Attribute_clone_32154287639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53058;
     Object term131455;
     Object term131401;

    public Attribute_clone_32154287639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53058 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term53083 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term53085 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53086 = (Object[]) newArray("java.lang.String", 0);
        setField(term53058, term53058.getClass(), "key", "nyiiPDVjAc");
        setField(term53058, term53058.getClass(), "val", "aKnKipADSo");
        setIntField(term53083, term53083.getClass(), "size", -883034806);
        setField(term53083, term53083.getClass(), "keys", term53085);
        setField(term53083, term53083.getClass(), "vals", term53086);
        setField(term53058, term53058.getClass(), "parent", term53083);
        term131455 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term131460 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term131461 = (Object[]) newArray("java.lang.String", 0);
        Object[] term131462 = (Object[]) newArray("java.lang.String", 0);
        setField(term131455, term131455.getClass(), "key", "nyiiPDVjAc");
        setField(term131455, term131455.getClass(), "val", "aKnKipADSo");
        setIntField(term131460, term131460.getClass(), "size", -883034806);
        setField(term131460, term131460.getClass(), "keys", term131461);
        setField(term131460, term131460.getClass(), "vals", term131462);
        setField(term131455, term131455.getClass(), "parent", term131460);
        term131401 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term131426 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term131428 = (Object[]) newArray("java.lang.String", 0);
        Object[] term131429 = (Object[]) newArray("java.lang.String", 0);
        setField(term131401, term131401.getClass(), "key", "nyiiPDVjAc");
        setField(term131401, term131401.getClass(), "val", "aKnKipADSo");
        setIntField(term131426, term131426.getClass(), "size", -883034806);
        setField(term131426, term131426.getClass(), "keys", term131428);
        setField(term131426, term131426.getClass(), "vals", term131429);
        setField(term131401, term131401.getClass(), "parent", term131426);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term53058, args);
        assertTrue(recursiveEquals(term53058, term131455));
        assertTrue(recursiveEquals(retValue, term131401));
    }

};


