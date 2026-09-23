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

public class ExtendedMessageFormat_containsElements_106669777737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1753;
     Object term6450;

    public ExtendedMessageFormat_containsElements_106669777737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1753 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(term1753, term1753.getClass(), "toPattern", null);
        setField(term1753, term1753.getClass(), "registry", null);
        setField(term1753, term1753.getClass(), "locale", null);
        setField(term1753, term1753.getClass(), "pattern", null);
        setField(term1753, term1753.getClass(), "formats", null);
        setField(term1753, term1753.getClass(), "offsets", null);
        setField(term1753, term1753.getClass(), "argumentNumbers", null);
        setIntField(term1753, term1753.getClass(), "maxOffset", 0);
        term6450 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(term6450, term6450.getClass(), "toPattern", null);
        setField(term6450, term6450.getClass(), "registry", null);
        setField(term6450, term6450.getClass(), "locale", null);
        setField(term6450, term6450.getClass(), "pattern", null);
        setField(term6450, term6450.getClass(), "formats", null);
        setField(term6450, term6450.getClass(), "offsets", null);
        setField(term6450, term6450.getClass(), "argumentNumbers", null);
        setIntField(term6450, term6450.getClass(), "maxOffset", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "containsElements", argTypes, term1753, args);
        assertTrue(recursiveEquals(term1753, term6450));
        assertTrue(recursiveEquals(retValue, false));
    }

};


