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
import java.lang.Boolean;

public class PosixParser_burstToken_160441250713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term872;
     Object term1000;
     Object term2381;

    public PosixParser_burstToken_160441250713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term873 = new ArrayList();
        ArrayList term931 = new ArrayList();
        HashMap term965 = new HashMap();
        HashMap term970 = new HashMap();
        ArrayList term975 = new ArrayList();
        HashMap term979 = new HashMap();
        LinkedList term957 = new LinkedList();
        ArrayList term960 = new ArrayList();
        ArrayList term984 = new ArrayList();
        term872 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term878 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term930 = newInstance(Class.forName("java.lang.Object"));
        Object term964 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term956 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term872, term872.getClass(), "tokens", term873);
        setBooleanField(term872, term872.getClass(), "eatTheRest", true);
        setField(term878, term878.getClass(), "opt", "eZFUvlxvGV");
        setField(term878, term878.getClass(), "longOpt", "BYqFIqCKAV");
        setField(term878, term878.getClass(), "argName", "vrQLuWIDJX");
        setField(term878, term878.getClass(), "description", "flxyYxBRtu");
        setBooleanField(term878, term878.getClass(), "required", false);
        setBooleanField(term878, term878.getClass(), "optionalArg", false);
        setIntField(term878, term878.getClass(), "numberOfArgs", -616727354);
        setField(term878, term878.getClass(), "type", term930);
        setField(term878, term878.getClass(), "values", term931);
        setCharField(term878, term878.getClass(), "valuesep", 'n');
        setField(term872, term872.getClass(), "currentOption", term878);
        setField(term964, term964.getClass(), "shortOpts", term965);
        setField(term964, term964.getClass(), "longOpts", term970);
        setField(term964, term964.getClass(), "requiredOpts", term975);
        setField(term964, term964.getClass(), "optionGroups", term979);
        setField(term872, term872.getClass(), "options", term964);
        setField(term956, term956.getClass(), "args", term957);
        setField(term956, term956.getClass(), "options", term960);
        setField(term872, term872.getClass(), "cmd", term956);
        setField(term872, term872.getClass(), "requiredOptions", term984);
        term1000 = new Boolean(true);
        ArrayList term2382 = new ArrayList();
        ((ArrayList) term2382).add("--");
        ((ArrayList) term2382).add("clPbYPkcH");
        ArrayList term2398 = new ArrayList();
        LinkedList term2401 = new LinkedList();
        ArrayList term2402 = new ArrayList();
        ArrayList term2404 = new ArrayList();
        term2381 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term2388 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2397 = newInstance(Class.forName("java.lang.Object"));
        Object term2400 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        setField(term2381, term2381.getClass(), "tokens", term2382);
        setBooleanField(term2381, term2381.getClass(), "eatTheRest", true);
        setField(term2388, term2388.getClass(), "opt", "eZFUvlxvGV");
        setField(term2388, term2388.getClass(), "longOpt", "BYqFIqCKAV");
        setField(term2388, term2388.getClass(), "argName", "vrQLuWIDJX");
        setField(term2388, term2388.getClass(), "description", "flxyYxBRtu");
        setBooleanField(term2388, term2388.getClass(), "required", false);
        setBooleanField(term2388, term2388.getClass(), "optionalArg", false);
        setIntField(term2388, term2388.getClass(), "numberOfArgs", -616727354);
        setField(term2388, term2388.getClass(), "type", term2397);
        setField(term2388, term2388.getClass(), "values", term2398);
        setCharField(term2388, term2388.getClass(), "valuesep", 'n');
        setField(term2381, term2381.getClass(), "currentOption", term2388);
        setField(term2381, term2381.getClass(), "options", null);
        setField(term2400, term2400.getClass(), "args", term2401);
        setField(term2400, term2400.getClass(), "options", term2402);
        setField(term2381, term2381.getClass(), "cmd", term2400);
        setField(term2381, term2381.getClass(), "requiredOptions", term2404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "OclPbYPkcH";
        args[1] = term1000;
        callMethod(klass, "burstToken", argTypes, term872, args);
        assertTrue(recursiveEquals(term872, term2381));
        assertTrue(recursiveEquals(term1000, true));
    }

};


