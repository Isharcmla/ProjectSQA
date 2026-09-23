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

public class Attributes_put_28062925361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2862871;
     Object term3616288;
     Object term3615660;

    public Attributes_put_28062925361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2862871 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term2862280 = (Object[]) newArray("java.lang.String", 41);
        Object[] term2862282 = (Object[]) newArray("java.lang.String", 32);
        setIntField(term2862871, term2862871.getClass(), "size", 1);
        setElement(term2862280, 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term2862871, term2862871.getClass(), "keys", term2862280);
        setField(term2862871, term2862871.getClass(), "vals", term2862282);
        term3616288 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3616289 = (Object[]) newArray("java.lang.String", 41);
        Object[] term3616298 = (Object[]) newArray("java.lang.String", 32);
        setIntField(term3616288, term3616288.getClass(), "size", 2);
        setElement(term3616289, 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setElement(term3616289, 1, "");
        setField(term3616288, term3616288.getClass(), "keys", term3616289);
        setField(term3616288, term3616288.getClass(), "vals", term3616298);
        term3615660 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3615663 = (Object[]) newArray("java.lang.String", 41);
        Object[] term3616162 = (Object[]) newArray("java.lang.String", 32);
        setIntField(term3615660, term3615660.getClass(), "size", 2);
        setElement(term3615663, 0, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setElement(term3615663, 1, "");
        setField(term3615660, term3615660.getClass(), "keys", term3615663);
        setField(term3615660, term3615660.getClass(), "vals", term3616162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = true;
        Object retValue = callMethod(klass, "put", argTypes, term2862871, args);
        assertTrue(recursiveEquals(term2862871, term3616288));
        assertTrue(recursiveEquals(retValue, term3615660));
    }

};


