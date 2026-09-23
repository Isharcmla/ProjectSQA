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
import java.util.ArrayList;

public class ExtendedMessageFormat_containsElements_106669777739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6999;
     Object term7051;
     Object term7068;
     Object term7069;

    public ExtendedMessageFormat_containsElements_106669777739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6999 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        term7051 = new ArrayList();
        term7068 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        setField(term7068, term7068.getClass(), "toPattern", null);
        setField(term7068, term7068.getClass(), "registry", null);
        setField(term7068, term7068.getClass(), "locale", null);
        setField(term7068, term7068.getClass(), "pattern", null);
        setField(term7068, term7068.getClass(), "formats", null);
        setField(term7068, term7068.getClass(), "offsets", null);
        setField(term7068, term7068.getClass(), "argumentNumbers", null);
        setIntField(term7068, term7068.getClass(), "maxOffset", 0);
        term7069 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term7051;
        Object retValue = callMethod(klass, "containsElements", argTypes, term6999, args);
        assertTrue(recursiveEquals(term6999, term7068));
        assertTrue(recursiveEquals(term7051, term7069));
        assertTrue(recursiveEquals(retValue, false));
    }

};


