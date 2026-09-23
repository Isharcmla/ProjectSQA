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

public class PosixParser_burstToken_160441250731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14649;
     Object term15782;

    public PosixParser_burstToken_160441250731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14763 = new HashMap();
        HashMap term14915 = new HashMap();
        ArrayList term15071 = new ArrayList();
        term14649 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term14715 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term14715, term14715.getClass(), "shortOpts", term14763);
        setField(term14715, term14715.getClass(), "longOpts", term14915);
        setField(term14649, term14649.getClass(), "options", term14715);
        setField(term14649, term14649.getClass(), "tokens", term15071);
        ArrayList term15783 = new ArrayList();
        ((ArrayList) term15783).add("                                                                                                                                ");
        term15782 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term15782, term15782.getClass(), "tokens", term15783);
        setBooleanField(term15782, term15782.getClass(), "eatTheRest", false);
        setField(term15782, term15782.getClass(), "currentOption", null);
        setField(term15782, term15782.getClass(), "options", null);
        setField(term15782, term15782.getClass(), "cmd", null);
        setField(term15782, term15782.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                ";
        args[1] = false;
        callMethod(klass, "burstToken", argTypes, term14649, args);
        assertTrue(recursiveEquals(term14649, term15782));
    }

};


