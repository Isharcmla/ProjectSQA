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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayList;

public class PosixParser_burstToken_160441250727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15554;
     Object term16064;

    public PosixParser_burstToken_160441250727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term15668 = new HashMap();
        HashMap term15820 = new HashMap();
        ArrayList term15976 = new ArrayList();
        term15554 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term15620 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term15620, term15620.getClass(), "shortOpts", term15668);
        setField(term15620, term15620.getClass(), "longOpts", term15820);
        setField(term15554, term15554.getClass(), "options", term15620);
        setField(term15554, term15554.getClass(), "tokens", term15976);
        ArrayList term16065 = new ArrayList();
        ((ArrayList) term16065).add("    ");
        term16064 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term16064, term16064.getClass(), "tokens", term16065);
        setBooleanField(term16064, term16064.getClass(), "eatTheRest", false);
        setField(term16064, term16064.getClass(), "currentOption", null);
        setField(term16064, term16064.getClass(), "options", null);
        setField(term16064, term16064.getClass(), "cmd", null);
        setField(term16064, term16064.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "    ";
        args[1] = false;
        callMethod(klass, "burstToken", argTypes, term15554, args);
        assertTrue(recursiveEquals(term15554, term16064));
    }

};


