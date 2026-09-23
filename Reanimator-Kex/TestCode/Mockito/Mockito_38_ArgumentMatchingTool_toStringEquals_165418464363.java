package org.mockito.internal.verification.argumentmatching;

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
import java.lang.reflect.InaccessibleObjectException;
import static org.mockito.internal.verification.argumentmatching.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class ArgumentMatchingTool_toStringEquals_165418464363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27499;
     Object term27593;

    public ArgumentMatchingTool_toStringEquals_165418464363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27499 = newInstance(Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool"));
        Class term27697 = char.class;
        Class<? extends Object> term27771 = Class.forName((String) "net.sourceforge.cobertura.reporting.html.files.CopyFiles");
        term27593 = newInstance(Class.forName("org.hamcrest.collection.IsCollectionWithSize"));
        Object term27661 = newInstance(Class.forName("org.hamcrest.object.IsEventFrom"));
        setField(term27593, term27593.getClass(), "featureDescription", null);
        setField(term27661, term27661.getClass(), "eventClass", term27697);
        setField(term27661, term27661.getClass(), "source", term27771);
        setField(term27593, term27593.getClass(), "subMatcher", term27661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.verification.argumentmatching.ArgumentMatchingTool");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.hamcrest.Matcher");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term27593;
        args[1] = null;
        try {
            callMethod(klass, "toStringEquals", argTypes, term27499, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


