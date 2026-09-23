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

public class Attributes_normalize_703706418553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14504964;
     Object term14504987;

    public Attributes_normalize_703706418553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14504964 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14504876 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term14504964, term14504964.getClass(), "size", 3);
        setField(term14504964, term14504964.getClass(), "keys", term14504876);
        term14504987 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term14504988 = (Object[]) newArray("java.lang.String", 490);
        setIntField(term14504987, term14504987.getClass(), "size", 3);
        setElement(term14504988, 0, "");
        setElement(term14504988, 1, "");
        setElement(term14504988, 2, "");
        setField(term14504987, term14504987.getClass(), "keys", term14504988);
        setField(term14504987, term14504987.getClass(), "vals", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "normalize", argTypes, term14504964, args);
        assertTrue(recursiveEquals(term14504964, term14504987));
    }

};


