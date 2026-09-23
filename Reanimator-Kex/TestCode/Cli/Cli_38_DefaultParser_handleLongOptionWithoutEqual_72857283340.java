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
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class DefaultParser_handleLongOptionWithoutEqual_72857283340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3176;
     Object term11026;

    public DefaultParser_handleLongOptionWithoutEqual_72857283340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3178 = new LinkedList();
        ArrayList term3181 = new ArrayList();
        LinkedHashMap term3186 = new LinkedHashMap();
        LinkedHashMap term3192 = new LinkedHashMap();
        ArrayList term3198 = new ArrayList();
        LinkedHashMap term3202 = new LinkedHashMap();
        ArrayList term3273 = new ArrayList();
        ArrayList term3279 = new ArrayList();
        term3176 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3177 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3185 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3221 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3177, term3177.getClass(), "args", term3178);
        setField(term3177, term3177.getClass(), "options", term3181);
        setField(term3176, term3176.getClass(), "cmd", term3177);
        setField(term3185, term3185.getClass(), "shortOpts", term3186);
        setField(term3185, term3185.getClass(), "longOpts", term3192);
        setField(term3185, term3185.getClass(), "requiredOpts", term3198);
        setField(term3185, term3185.getClass(), "optionGroups", term3202);
        setField(term3176, term3176.getClass(), "options", term3185);
        setBooleanField(term3176, term3176.getClass(), "stopAtNonOption", true);
        setField(term3176, term3176.getClass(), "currentToken", "FPvxVzzSvD");
        setField(term3221, term3221.getClass(), "opt", "WHcwFgsGFC");
        setField(term3221, term3221.getClass(), "longOpt", "HzqpegHiRq");
        setField(term3221, term3221.getClass(), "argName", "jwsfVjMoJT");
        setField(term3221, term3221.getClass(), "description", "ZfdXfCCFDf");
        setBooleanField(term3221, term3221.getClass(), "required", true);
        setBooleanField(term3221, term3221.getClass(), "optionalArg", false);
        setIntField(term3221, term3221.getClass(), "numberOfArgs", 597278769);
        setField(term3221, term3221.getClass(), "type", null);
        setField(term3221, term3221.getClass(), "values", term3273);
        setCharField(term3221, term3221.getClass(), "valuesep", 'E');
        setField(term3176, term3176.getClass(), "currentOption", term3221);
        setBooleanField(term3176, term3176.getClass(), "skipParsing", false);
        setField(term3176, term3176.getClass(), "expectedOpts", term3279);
        LinkedList term11028 = new LinkedList();
        ((LinkedList) term11028).add("");
        ArrayList term11031 = new ArrayList();
        LinkedHashMap term11034 = new LinkedHashMap();
        LinkedHashMap term11035 = new LinkedHashMap();
        ArrayList term11037 = new ArrayList();
        LinkedHashMap term11039 = new LinkedHashMap();
        ArrayList term11051 = new ArrayList();
        ArrayList term11053 = new ArrayList();
        term11026 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term11027 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term11033 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term11042 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term11027, term11027.getClass(), "args", term11028);
        setField(term11027, term11027.getClass(), "options", term11031);
        setField(term11026, term11026.getClass(), "cmd", term11027);
        setField(term11033, term11033.getClass(), "shortOpts", term11034);
        setField(term11033, term11033.getClass(), "longOpts", term11035);
        setField(term11033, term11033.getClass(), "requiredOpts", term11037);
        setField(term11033, term11033.getClass(), "optionGroups", term11039);
        setField(term11026, term11026.getClass(), "options", term11033);
        setBooleanField(term11026, term11026.getClass(), "stopAtNonOption", true);
        setField(term11026, term11026.getClass(), "currentToken", "FPvxVzzSvD");
        setField(term11042, term11042.getClass(), "opt", "WHcwFgsGFC");
        setField(term11042, term11042.getClass(), "longOpt", "HzqpegHiRq");
        setField(term11042, term11042.getClass(), "argName", "jwsfVjMoJT");
        setField(term11042, term11042.getClass(), "description", "ZfdXfCCFDf");
        setBooleanField(term11042, term11042.getClass(), "required", true);
        setBooleanField(term11042, term11042.getClass(), "optionalArg", false);
        setIntField(term11042, term11042.getClass(), "numberOfArgs", 597278769);
        setField(term11042, term11042.getClass(), "type", null);
        setField(term11042, term11042.getClass(), "values", term11051);
        setCharField(term11042, term11042.getClass(), "valuesep", 'E');
        setField(term11026, term11026.getClass(), "currentOption", term11042);
        setBooleanField(term11026, term11026.getClass(), "skipParsing", true);
        setField(term11026, term11026.getClass(), "expectedOpts", term11053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MwwjNtdOFT";
        callMethod(klass, "handleLongOptionWithoutEqual", argTypes, term3176, args);
        assertTrue(recursiveEquals(term3176, term11026));
    }

};


