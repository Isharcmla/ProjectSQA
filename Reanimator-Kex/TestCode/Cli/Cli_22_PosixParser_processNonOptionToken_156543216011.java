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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedList;

public class PosixParser_processNonOptionToken_156543216011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;
     Object term973;

    public PosixParser_processNonOptionToken_156543216011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term265 = new ArrayList();
        HashMap term299 = new HashMap();
        HashMap term304 = new HashMap();
        ArrayList term309 = new ArrayList();
        HashMap term313 = new HashMap();
        LinkedList term291 = new LinkedList();
        ArrayList term294 = new ArrayList();
        ArrayList term318 = new ArrayList();
        term264 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term298 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term290 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term264, term264.getClass(), "tokens", term265);
        setBooleanField(term264, term264.getClass(), "eatTheRest", true);
        setField(term298, term298.getClass(), "shortOpts", term299);
        setField(term298, term298.getClass(), "longOpts", term304);
        setField(term298, term298.getClass(), "requiredOpts", term309);
        setField(term298, term298.getClass(), "optionGroups", term313);
        setField(term264, term264.getClass(), "options", term298);
        setField(term290, term290.getClass(), "args", term291);
        setField(term290, term290.getClass(), "options", term294);
        setField(term264, term264.getClass(), "cmd", term290);
        setField(term264, term264.getClass(), "requiredOptions", term318);
        ArrayList term974 = new ArrayList();
        ((ArrayList) term974).add("--");
        ((ArrayList) term974).add("xxtlPwDYFs");
        LinkedList term981 = new LinkedList();
        ArrayList term982 = new ArrayList();
        ArrayList term984 = new ArrayList();
        term973 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term980 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term973, term973.getClass(), "tokens", term974);
        setBooleanField(term973, term973.getClass(), "eatTheRest", true);
        setField(term973, term973.getClass(), "options", null);
        setField(term980, term980.getClass(), "args", term981);
        setField(term980, term980.getClass(), "options", term982);
        setField(term973, term973.getClass(), "cmd", term980);
        setField(term973, term973.getClass(), "requiredOptions", term984);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "processNonOptionToken", argTypes, term264, args);
        assertTrue(recursiveEquals(term264, term973));
    }

};


