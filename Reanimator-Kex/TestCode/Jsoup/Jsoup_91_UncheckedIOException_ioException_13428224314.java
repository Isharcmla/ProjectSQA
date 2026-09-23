package org.jsoup;

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
import static org.jsoup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.EqualityUtils.*;

public class UncheckedIOException_ioException_13428224314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5649;
     Object term9426;

    public UncheckedIOException_ioException_13428224314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5649 = newInstance(Class.forName("org.jsoup.UncheckedIOException"));
        setField(term5649, term5649.getClass(), "backtrace", null);
        setField(term5649, term5649.getClass(), "detailMessage", null);
        setField(term5649, term5649.getClass(), "cause", null);
        setField(term5649, term5649.getClass(), "stackTrace", null);
        setIntField(term5649, term5649.getClass(), "depth", 0);
        setField(term5649, term5649.getClass(), "suppressedExceptions", null);
        term9426 = newInstance(Class.forName("org.jsoup.UncheckedIOException"));
        setField(term9426, term9426.getClass(), "backtrace", null);
        setField(term9426, term9426.getClass(), "detailMessage", null);
        setField(term9426, term9426.getClass(), "cause", null);
        setField(term9426, term9426.getClass(), "stackTrace", null);
        setIntField(term9426, term9426.getClass(), "depth", 0);
        setField(term9426, term9426.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.UncheckedIOException");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "ioException", argTypes, term5649, args);
        assertTrue(recursiveEquals(term5649, term9426));
        assertTrue(recursiveEquals(retValue, null));
    }

};


