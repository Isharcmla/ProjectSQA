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
import java.util.LinkedHashMap;

public class Attributes_clone_1156168700187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5036746;
     Object term5036826;
     Object term5036819;

    public Attributes_clone_1156168700187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term5036806 = new LinkedHashMap();
        term5036746 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5036746, term5036746.getClass(), "attributes", term5036806);
        LinkedHashMap term5036827 = new LinkedHashMap();
        term5036826 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5036826, term5036826.getClass(), "attributes", term5036827);
        LinkedHashMap term5036820 = new LinkedHashMap();
        term5036819 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5036819, term5036819.getClass(), "attributes", term5036820);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term5036746, args);
        assertTrue(recursiveEquals(term5036746, term5036826));
        assertTrue(recursiveEquals(retValue, term5036819));
    }

};


