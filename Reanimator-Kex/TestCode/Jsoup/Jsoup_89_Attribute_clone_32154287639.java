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
     Object term131681;
     Object term131627;

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
        term131681 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term131686 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term131687 = (Object[]) newArray("java.lang.String", 0);
        Object[] term131688 = (Object[]) newArray("java.lang.String", 0);
        setField(term131681, term131681.getClass(), "key", "nyiiPDVjAc");
        setField(term131681, term131681.getClass(), "val", "aKnKipADSo");
        setIntField(term131686, term131686.getClass(), "size", -883034806);
        setField(term131686, term131686.getClass(), "keys", term131687);
        setField(term131686, term131686.getClass(), "vals", term131688);
        setField(term131681, term131681.getClass(), "parent", term131686);
        term131627 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        Object term131652 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term131654 = (Object[]) newArray("java.lang.String", 0);
        Object[] term131655 = (Object[]) newArray("java.lang.String", 0);
        setField(term131627, term131627.getClass(), "key", "nyiiPDVjAc");
        setField(term131627, term131627.getClass(), "val", "aKnKipADSo");
        setIntField(term131652, term131652.getClass(), "size", -883034806);
        setField(term131652, term131652.getClass(), "keys", term131654);
        setField(term131652, term131652.getClass(), "vals", term131655);
        setField(term131627, term131627.getClass(), "parent", term131652);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term53058, args);
        assertTrue(recursiveEquals(term53058, term131681));
        assertTrue(recursiveEquals(retValue, term131627));
    }

};


