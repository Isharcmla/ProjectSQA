package org.apache.commons.cli;

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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class PosixParser_burstToken_160441250723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11355;

    public PosixParser_burstToken_160441250723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11469 = new HashMap();
        HashMap term11621 = new HashMap();
        term11355 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term11421 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term11789 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term11421, term11421.getClass(), "shortOpts", term11469);
        setField(term11421, term11421.getClass(), "longOpts", term11621);
        setField(term11355, term11355.getClass(), "options", term11421);
        setIntField(term11789, term11789.getClass(), "numberOfArgs", 1);
        setField(term11355, term11355.getClass(), "currentOption", term11789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "        ";
        args[1] = true;
        try {
            callMethod(klass, "burstToken", argTypes, term11355, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


