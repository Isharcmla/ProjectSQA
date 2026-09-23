package org.apache.commons.lang3.text;

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
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.text.EqualityUtils.*;

public class ExtendedMessageFormat_insertFormats_150880461943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8585;
     Object term8598;

    public ExtendedMessageFormat_insertFormats_150880461943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8585 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        term8598 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(term8598, term8598.getClass(), "toPattern", null);
        setField(term8598, term8598.getClass(), "registry", null);
        setField(term8598, term8598.getClass(), "locale", null);
        setField(term8598, term8598.getClass(), "pattern", null);
        setField(term8598, term8598.getClass(), "formats", null);
        setField(term8598, term8598.getClass(), "offsets", null);
        setField(term8598, term8598.getClass(), "argumentNumbers", null);
        setIntField(term8598, term8598.getClass(), "maxOffset", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.ArrayList");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "insertFormats", argTypes, term8585, args);
        assertTrue(recursiveEquals(term8585, term8598));
        assertTrue(recursiveEquals(retValue, null));
    }

};


