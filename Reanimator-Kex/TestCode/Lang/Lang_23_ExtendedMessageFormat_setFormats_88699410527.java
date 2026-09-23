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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.lang3.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;

public class ExtendedMessageFormat_setFormats_88699410527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term635;
     Object term689;

    public ExtendedMessageFormat_setFormats_88699410527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term648 = new HashMap();
        term635 = newInstance(Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat"));
        Object term653 = newInstance(Class.forName("java.util.Locale"));
        Object term654 = newInstance(Class.forName("sun.util.locale.BaseLocale"));
        Object[] term681 = (Object[]) newArray("java.text.Format", 2);
        int[] term682 = (int[]) newIntArray(3);
        int[] term686 = (int[]) newIntArray(1);
        setField(term635, term635.getClass(), "toPattern", "BYqFIqCKAV");
        setField(term635, term635.getClass(), "registry", term648);
        setField(term654, term654.getClass(), "language", "se");
        setField(term654, term654.getClass(), "script", "");
        setField(term654, term654.getClass(), "region", "SE");
        setField(term654, term654.getClass(), "variant", "");
        setIntField(term654, term654.getClass(), "hash", 109295708);
        setField(term653, term653.getClass(), "baseLocale", term654);
        setField(term653, term653.getClass(), "localeExtensions", null);
        setIntField(term653, term653.getClass(), "hashCodeValue", 109295708);
        setField(term653, term653.getClass(), "languageTag", null);
        setField(term635, term635.getClass(), "locale", term653);
        setField(term635, term635.getClass(), "pattern", "vrQLuWIDJX");
        setField(term635, term635.getClass(), "formats", term681);
        setIntElement(term682, 0, 454281060);
        setIntElement(term682, 1, -1786399638);
        setIntElement(term682, 2, 2055867847);
        setField(term635, term635.getClass(), "offsets", term682);
        setIntElement(term686, 0, -1048298087);
        setField(term635, term635.getClass(), "argumentNumbers", term686);
        setIntField(term635, term635.getClass(), "maxOffset", 292681826);
        term689 = (Object[]) newArray("java.text.Format", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.text.ExtendedMessageFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.text.Format"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term689;
        try {
            callMethod(klass, "setFormats", argTypes, term635, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


