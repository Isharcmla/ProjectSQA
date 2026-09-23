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
import java.lang.NegativeArraySizeException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Attributes_clone_115616870059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45566;

    public Attributes_clone_115616870059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45566 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term45568 = (Object[]) newArray("java.lang.String", 0);
        Object[] term45569 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term45566, term45566.getClass(), "size", -203030934);
        setField(term45566, term45566.getClass(), "keys", term45568);
        setField(term45566, term45566.getClass(), "vals", term45569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attributes");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "clone", argTypes, term45566, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


