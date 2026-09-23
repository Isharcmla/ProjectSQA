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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class DefaultParser_parse_16712595051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22556;
     Object term22804;
     Object term22971;
     Object term22983;
     Object term22938;

    public DefaultParser_parse_16712595051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22738 = new ArrayList();
        term22556 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term22622 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term22686 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term22556, term22556.getClass(), "options", term22622);
        setBooleanField(term22556, term22556.getClass(), "stopAtNonOption", false);
        setBooleanField(term22556, term22556.getClass(), "skipParsing", false);
        setField(term22556, term22556.getClass(), "currentOption", term22686);
        setField(term22556, term22556.getClass(), "expectedOpts", term22738);
        ArrayList term22856 = new ArrayList();
        HashMap term22904 = new HashMap();
        term22804 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term22804, term22804.getClass(), "requiredOpts", term22856);
        setField(term22804, term22804.getClass(), "optionGroups", term22904);
        LinkedList term22973 = new LinkedList();
        ArrayList term22974 = new ArrayList();
        ArrayList term22977 = new ArrayList();
        HashMap term22979 = new HashMap();
        ArrayList term22981 = new ArrayList();
        term22971 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term22972 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term22976 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term22972, term22972.getClass(), "args", term22973);
        setField(term22972, term22972.getClass(), "options", term22974);
        setField(term22971, term22971.getClass(), "cmd", term22972);
        setField(term22976, term22976.getClass(), "shortOpts", null);
        setField(term22976, term22976.getClass(), "longOpts", null);
        setField(term22976, term22976.getClass(), "requiredOpts", term22977);
        setField(term22976, term22976.getClass(), "optionGroups", term22979);
        setField(term22971, term22971.getClass(), "options", term22976);
        setBooleanField(term22971, term22971.getClass(), "stopAtNonOption", false);
        setField(term22971, term22971.getClass(), "currentToken", null);
        setField(term22971, term22971.getClass(), "currentOption", null);
        setBooleanField(term22971, term22971.getClass(), "skipParsing", false);
        setField(term22971, term22971.getClass(), "expectedOpts", term22981);
        ArrayList term22984 = new ArrayList();
        HashMap term22986 = new HashMap();
        term22983 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term22983, term22983.getClass(), "shortOpts", null);
        setField(term22983, term22983.getClass(), "longOpts", null);
        setField(term22983, term22983.getClass(), "requiredOpts", term22984);
        setField(term22983, term22983.getClass(), "optionGroups", term22986);
        LinkedList term22939 = new LinkedList();
        ArrayList term22942 = new ArrayList();
        term22938 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term22938, term22938.getClass(), "args", term22939);
        setField(term22938, term22938.getClass(), "options", term22942);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term22804;
        args[1] = null;
        Object retValue = callMethod(klass, "parse", argTypes, term22556, args);
        assertTrue(recursiveEquals(term22556, term22971));
        assertTrue(recursiveEquals(term22804, term22983));
        assertTrue(recursiveEquals(retValue, term22938));
    }

};


