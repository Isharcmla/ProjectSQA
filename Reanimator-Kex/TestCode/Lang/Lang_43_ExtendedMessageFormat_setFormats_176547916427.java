package org.apache.commons.lang.text;

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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_setFormats_176547916427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term567;
     Object term621;

    public ExtendedMessageFormat_setFormats_176547916427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term580 = new HashMap();
        term567 = newInstance(Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat"));
        Object term585 = newInstance(Class.forName("java.util.Locale"));
        Object term586 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term613 = (Object[]) newArray("java.text.Format", 2);
        int[] term614 = (int[]) newIntArray(3);
        int[] term618 = (int[]) newIntArray(1);
        setField(term567, term567.getClass(), "toPattern", "LQFpaHEwXR");
        setField(term567, term567.getClass(), "registry", term580);
        setField(term586, term586.getClass(), "language", "se");
        setField(term586, term586.getClass(), "script", "");
        setField(term586, term586.getClass(), "region", "SE");
        setField(term586, term586.getClass(), "variant", "");
        setIntField(term586, term586.getClass(), "hash", 109295708);
        setField(term585, term585.getClass(), "baseLocale", term586);
        setField(term585, term585.getClass(), "localeExtensions", null);
        setIntField(term585, term585.getClass(), "hashCodeValue", 109295708);
        setField(term585, term585.getClass(), "languageTag", null);
        setField(term567, term567.getClass(), "locale", term585);
        setField(term567, term567.getClass(), "pattern", "oVcInYnLWB");
        setField(term567, term567.getClass(), "formats", term613);
        setIntElement(term614, 0, 454281060);
        setIntElement(term614, 1, -1786399638);
        setIntElement(term614, 2, 2055867847);
        setField(term567, term567.getClass(), "offsets", term614);
        setIntElement(term618, 0, -1048298087);
        setField(term567, term567.getClass(), "argumentNumbers", term618);
        setIntField(term567, term567.getClass(), "maxOffset", 292681826);
        term621 = (Object[]) newArray("java.text.Format", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.text.Format"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term621;
        try {
            callMethod(klass, "setFormats", argTypes, term567, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


