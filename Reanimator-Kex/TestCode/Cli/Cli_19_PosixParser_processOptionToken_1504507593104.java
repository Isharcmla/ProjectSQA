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

public class PosixParser_processOptionToken_1504507593104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48514;

    public PosixParser_processOptionToken_1504507593104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term48718 = newInstance(Class.forName("java.lang.Object"));
        HashMap term48628 = new HashMap();
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        ((HashMap) term48628).put(term48718, term48718);
        Object term48908 = newInstance(Class.forName("java.lang.Object"));
        HashMap term48818 = new HashMap();
        ((HashMap) term48818).put(term48908, term48908);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        ((HashMap) term48818).put(term48718, term48718);
        term48514 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term48580 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term48580, term48580.getClass(), "shortOpts", term48628);
        setField(term48580, term48580.getClass(), "longOpts", term48818);
        setField(term48514, term48514.getClass(), "options", term48580);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = true;
        try {
            callMethod(klass, "processOptionToken", argTypes, term48514, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


