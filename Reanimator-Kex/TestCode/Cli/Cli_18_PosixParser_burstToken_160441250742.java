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

public class PosixParser_burstToken_160441250742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12194;
     Object term13248;

    public PosixParser_burstToken_160441250742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12308 = new HashMap();
        HashMap term12460 = new HashMap();
        ArrayList term12512 = new ArrayList();
        term12194 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term12260 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term12260, term12260.getClass(), "shortOpts", term12308);
        setField(term12260, term12260.getClass(), "longOpts", term12460);
        setField(term12194, term12194.getClass(), "options", term12260);
        setField(term12194, term12194.getClass(), "tokens", term12512);
        ArrayList term13249 = new ArrayList();
        ((ArrayList) term13249).add("                                                                                                                                ");
        term13248 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term13248, term13248.getClass(), "tokens", term13249);
        setBooleanField(term13248, term13248.getClass(), "eatTheRest", false);
        setField(term13248, term13248.getClass(), "currentOption", null);
        setField(term13248, term13248.getClass(), "options", null);
        setField(term13248, term13248.getClass(), "cmd", null);
        setField(term13248, term13248.getClass(), "requiredOptions", null);
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
        callMethod(klass, "burstToken", argTypes, term12194, args);
        assertTrue(recursiveEquals(term12194, term13248));
    }

};


