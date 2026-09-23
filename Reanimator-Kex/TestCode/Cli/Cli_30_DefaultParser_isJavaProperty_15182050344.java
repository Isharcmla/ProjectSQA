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
import java.util.HashMap;

public class DefaultParser_isJavaProperty_15182050344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3796;
     Object term12516;

    public DefaultParser_isJavaProperty_15182050344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term3798 = new LinkedList();
        ArrayList term3801 = new ArrayList();
        HashMap term3806 = new HashMap();
        HashMap term3811 = new HashMap();
        ArrayList term3816 = new ArrayList();
        HashMap term3820 = new HashMap();
        ArrayList term3891 = new ArrayList();
        ArrayList term3897 = new ArrayList();
        term3796 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term3797 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term3805 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term3838 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3890 = newInstance(Class.forName("java.lang.Object"));
        setField(term3797, term3797.getClass(), "args", term3798);
        setField(term3797, term3797.getClass(), "options", term3801);
        setField(term3796, term3796.getClass(), "cmd", term3797);
        setField(term3805, term3805.getClass(), "shortOpts", term3806);
        setField(term3805, term3805.getClass(), "longOpts", term3811);
        setField(term3805, term3805.getClass(), "requiredOpts", term3816);
        setField(term3805, term3805.getClass(), "optionGroups", term3820);
        setField(term3796, term3796.getClass(), "options", term3805);
        setBooleanField(term3796, term3796.getClass(), "stopAtNonOption", false);
        setField(term3796, term3796.getClass(), "currentToken", "lHfTrWKMPk");
        setField(term3838, term3838.getClass(), "opt", "JDaAnsVTGV");
        setField(term3838, term3838.getClass(), "longOpt", "mLUZFTfjle");
        setField(term3838, term3838.getClass(), "argName", "xIeFjkHkOe");
        setField(term3838, term3838.getClass(), "description", "SdCKLMIYnX");
        setBooleanField(term3838, term3838.getClass(), "required", true);
        setBooleanField(term3838, term3838.getClass(), "optionalArg", false);
        setIntField(term3838, term3838.getClass(), "numberOfArgs", 1048535127);
        setField(term3838, term3838.getClass(), "type", term3890);
        setField(term3838, term3838.getClass(), "values", term3891);
        setCharField(term3838, term3838.getClass(), "valuesep", 'b');
        setField(term3796, term3796.getClass(), "currentOption", term3838);
        setBooleanField(term3796, term3796.getClass(), "skipParsing", false);
        setField(term3796, term3796.getClass(), "expectedOpts", term3897);
        LinkedList term12518 = new LinkedList();
        ArrayList term12519 = new ArrayList();
        HashMap term12522 = new HashMap();
        HashMap term12523 = new HashMap();
        ArrayList term12524 = new ArrayList();
        HashMap term12526 = new HashMap();
        ArrayList term12539 = new ArrayList();
        ArrayList term12541 = new ArrayList();
        term12516 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term12517 = newInstance(Class.forName("org.apache.commons.cli.CommandLine"));
        Object term12521 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term12529 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term12538 = newInstance(Class.forName("java.lang.Object"));
        setField(term12517, term12517.getClass(), "args", term12518);
        setField(term12517, term12517.getClass(), "options", term12519);
        setField(term12516, term12516.getClass(), "cmd", term12517);
        setField(term12521, term12521.getClass(), "shortOpts", term12522);
        setField(term12521, term12521.getClass(), "longOpts", term12523);
        setField(term12521, term12521.getClass(), "requiredOpts", term12524);
        setField(term12521, term12521.getClass(), "optionGroups", term12526);
        setField(term12516, term12516.getClass(), "options", term12521);
        setBooleanField(term12516, term12516.getClass(), "stopAtNonOption", false);
        setField(term12516, term12516.getClass(), "currentToken", "lHfTrWKMPk");
        setField(term12529, term12529.getClass(), "opt", "JDaAnsVTGV");
        setField(term12529, term12529.getClass(), "longOpt", "mLUZFTfjle");
        setField(term12529, term12529.getClass(), "argName", "xIeFjkHkOe");
        setField(term12529, term12529.getClass(), "description", "SdCKLMIYnX");
        setBooleanField(term12529, term12529.getClass(), "required", true);
        setBooleanField(term12529, term12529.getClass(), "optionalArg", false);
        setIntField(term12529, term12529.getClass(), "numberOfArgs", 1048535127);
        setField(term12529, term12529.getClass(), "type", term12538);
        setField(term12529, term12529.getClass(), "values", term12539);
        setCharField(term12529, term12529.getClass(), "valuesep", 'b');
        setField(term12516, term12516.getClass(), "currentOption", term12529);
        setBooleanField(term12516, term12516.getClass(), "skipParsing", false);
        setField(term12516, term12516.getClass(), "expectedOpts", term12541);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OJJtVNPyKZ";
        Object retValue = callMethod(klass, "isJavaProperty", argTypes, term3796, args);
        assertTrue(recursiveEquals(term3796, term12516));
        assertTrue(recursiveEquals(retValue, false));
    }

};


