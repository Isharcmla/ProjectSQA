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

public class Attributes_indexOfKey_193842428587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15648949;
     Object term15659256;

    public Attributes_indexOfKey_193842428587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15648949 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15647930 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term15648949, term15648949.getClass(), "size", 7);
        setElement(term15647930, 5, "");
        setField(term15648949, term15648949.getClass(), "keys", term15647930);
        term15659256 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term15659257 = (Object[]) newArray("java.lang.String", 493);
        setIntField(term15659256, term15659256.getClass(), "size", 7);
        setElement(term15659257, 5, "");
        setField(term15659256, term15659256.getClass(), "keys", term15659257);
        setField(term15659256, term15659256.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        Object retValue = callMethod(klass, "indexOfKey", argTypes, term15648949, args);
        assertTrue(recursiveEquals(term15648949, term15659256));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


