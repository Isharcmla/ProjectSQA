package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;

public class DeadAssignmentsElimination_isVariableStillLiveWithinExpression_172036382719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821;
     Object term838;
     Object term865;

    public DeadAssignmentsElimination_isVariableStillLiveWithinExpression_172036382719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term824 = new HashMap();
        term821 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        Object term822 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term823 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term830 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term821, term821.getClass(), "compiler", null);
        setField(term823, term823.getClass(), "vars", term824);
        setField(term830, term830.getClass(), "vars", null);
        setField(term830, term830.getClass(), "parent", null);
        setIntField(term830, term830.getClass(), "depth", 0);
        setField(term830, term830.getClass(), "rootNode", null);
        setField(term830, term830.getClass(), "thisType", null);
        setBooleanField(term830, term830.getClass(), "isBottom", false);
        setField(term823, term823.getClass(), "parent", term830);
        setIntField(term823, term823.getClass(), "depth", -1667990367);
        setIntField(term834, term834.getClass(), "type", 0);
        setField(term834, term834.getClass(), "next", null);
        setField(term834, term834.getClass(), "first", null);
        setField(term834, term834.getClass(), "last", null);
        setField(term834, term834.getClass(), "propListHead", null);
        setIntField(term834, term834.getClass(), "sourcePosition", 0);
        setField(term834, term834.getClass(), "jsType", null);
        setField(term834, term834.getClass(), "parent", null);
        setField(term823, term823.getClass(), "rootNode", term834);
        setField(term823, term823.getClass(), "thisType", null);
        setBooleanField(term823, term823.getClass(), "isBottom", false);
        setField(term822, term822.getClass(), "jsScope", term823);
        setField(term822, term822.getClass(), "escaped", null);
        setField(term822, term822.getClass(), "cfg", null);
        setField(term822, term822.getClass(), "joinOp", null);
        setField(term822, term822.getClass(), "orderedWorkSet", null);
        setField(term821, term821.getClass(), "liveness", term822);
        term838 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term848 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term851 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term855 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term858 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term861 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term838, term838.getClass(), "type", -1222614956);
        setIntField(term840, term840.getClass(), "type", -571169753);
        setIntField(term842, term842.getClass(), "type", 0);
        setField(term842, term842.getClass(), "next", null);
        setField(term842, term842.getClass(), "first", null);
        setField(term842, term842.getClass(), "last", null);
        setField(term842, term842.getClass(), "propListHead", null);
        setIntField(term842, term842.getClass(), "sourcePosition", 0);
        setField(term842, term842.getClass(), "jsType", null);
        setField(term842, term842.getClass(), "parent", null);
        setField(term840, term840.getClass(), "next", term842);
        setIntField(term845, term845.getClass(), "type", 0);
        setField(term845, term845.getClass(), "next", null);
        setField(term845, term845.getClass(), "first", null);
        setField(term845, term845.getClass(), "last", null);
        setField(term845, term845.getClass(), "propListHead", null);
        setIntField(term845, term845.getClass(), "sourcePosition", 0);
        setField(term845, term845.getClass(), "jsType", null);
        setField(term845, term845.getClass(), "parent", null);
        setField(term840, term840.getClass(), "first", term845);
        setIntField(term848, term848.getClass(), "type", 0);
        setField(term848, term848.getClass(), "next", null);
        setField(term848, term848.getClass(), "first", null);
        setField(term848, term848.getClass(), "last", null);
        setField(term848, term848.getClass(), "propListHead", null);
        setIntField(term848, term848.getClass(), "sourcePosition", 0);
        setField(term848, term848.getClass(), "jsType", null);
        setField(term848, term848.getClass(), "parent", null);
        setField(term840, term840.getClass(), "last", term848);
        setField(term851, term851.getClass(), "next", null);
        setIntField(term851, term851.getClass(), "type", 0);
        setIntField(term851, term851.getClass(), "intValue", 0);
        setField(term851, term851.getClass(), "objectValue", null);
        setField(term840, term840.getClass(), "propListHead", term851);
        setIntField(term840, term840.getClass(), "sourcePosition", -1347358701);
        setField(term840, term840.getClass(), "jsType", null);
        setField(term840, term840.getClass(), "parent", null);
        setField(term838, term838.getClass(), "next", term840);
        setIntField(term855, term855.getClass(), "type", 0);
        setField(term855, term855.getClass(), "next", null);
        setField(term855, term855.getClass(), "first", null);
        setField(term855, term855.getClass(), "last", null);
        setField(term855, term855.getClass(), "propListHead", null);
        setIntField(term855, term855.getClass(), "sourcePosition", 0);
        setField(term855, term855.getClass(), "jsType", null);
        setField(term855, term855.getClass(), "parent", null);
        setField(term838, term838.getClass(), "first", term855);
        setIntField(term858, term858.getClass(), "type", 0);
        setField(term858, term858.getClass(), "next", null);
        setField(term858, term858.getClass(), "first", null);
        setField(term858, term858.getClass(), "last", null);
        setField(term858, term858.getClass(), "propListHead", null);
        setIntField(term858, term858.getClass(), "sourcePosition", 0);
        setField(term858, term858.getClass(), "jsType", null);
        setField(term858, term858.getClass(), "parent", null);
        setField(term838, term838.getClass(), "last", term858);
        setField(term861, term861.getClass(), "next", null);
        setIntField(term861, term861.getClass(), "type", 0);
        setIntField(term861, term861.getClass(), "intValue", 0);
        setField(term861, term861.getClass(), "objectValue", null);
        setField(term838, term838.getClass(), "propListHead", term861);
        setIntField(term838, term838.getClass(), "sourcePosition", 806595993);
        setField(term838, term838.getClass(), "jsType", null);
        setField(term838, term838.getClass(), "parent", null);
        term865 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term888 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term865, term865.getClass(), "type", 937859191);
        setIntField(term867, term867.getClass(), "type", 880977281);
        setIntField(term869, term869.getClass(), "type", 0);
        setField(term869, term869.getClass(), "next", null);
        setField(term869, term869.getClass(), "first", null);
        setField(term869, term869.getClass(), "last", null);
        setField(term869, term869.getClass(), "propListHead", null);
        setIntField(term869, term869.getClass(), "sourcePosition", 0);
        setField(term869, term869.getClass(), "jsType", null);
        setField(term869, term869.getClass(), "parent", null);
        setField(term867, term867.getClass(), "next", term869);
        setIntField(term872, term872.getClass(), "type", 0);
        setField(term872, term872.getClass(), "next", null);
        setField(term872, term872.getClass(), "first", null);
        setField(term872, term872.getClass(), "last", null);
        setField(term872, term872.getClass(), "propListHead", null);
        setIntField(term872, term872.getClass(), "sourcePosition", 0);
        setField(term872, term872.getClass(), "jsType", null);
        setField(term872, term872.getClass(), "parent", null);
        setField(term867, term867.getClass(), "first", term872);
        setIntField(term875, term875.getClass(), "type", 0);
        setField(term875, term875.getClass(), "next", null);
        setField(term875, term875.getClass(), "first", null);
        setField(term875, term875.getClass(), "last", null);
        setField(term875, term875.getClass(), "propListHead", null);
        setIntField(term875, term875.getClass(), "sourcePosition", 0);
        setField(term875, term875.getClass(), "jsType", null);
        setField(term875, term875.getClass(), "parent", null);
        setField(term867, term867.getClass(), "last", term875);
        setField(term878, term878.getClass(), "next", null);
        setIntField(term878, term878.getClass(), "type", 0);
        setIntField(term878, term878.getClass(), "intValue", 0);
        setField(term878, term878.getClass(), "objectValue", null);
        setField(term867, term867.getClass(), "propListHead", term878);
        setIntField(term867, term867.getClass(), "sourcePosition", -159494544);
        setField(term867, term867.getClass(), "jsType", null);
        setField(term867, term867.getClass(), "parent", null);
        setField(term865, term865.getClass(), "next", term867);
        setIntField(term882, term882.getClass(), "type", 0);
        setField(term882, term882.getClass(), "next", null);
        setField(term882, term882.getClass(), "first", null);
        setField(term882, term882.getClass(), "last", null);
        setField(term882, term882.getClass(), "propListHead", null);
        setIntField(term882, term882.getClass(), "sourcePosition", 0);
        setField(term882, term882.getClass(), "jsType", null);
        setField(term882, term882.getClass(), "parent", null);
        setField(term865, term865.getClass(), "first", term882);
        setIntField(term885, term885.getClass(), "type", 0);
        setField(term885, term885.getClass(), "next", null);
        setField(term885, term885.getClass(), "first", null);
        setField(term885, term885.getClass(), "last", null);
        setField(term885, term885.getClass(), "propListHead", null);
        setIntField(term885, term885.getClass(), "sourcePosition", 0);
        setField(term885, term885.getClass(), "jsType", null);
        setField(term885, term885.getClass(), "parent", null);
        setField(term865, term865.getClass(), "last", term885);
        setField(term888, term888.getClass(), "next", null);
        setIntField(term888, term888.getClass(), "type", 0);
        setIntField(term888, term888.getClass(), "intValue", 0);
        setField(term888, term888.getClass(), "objectValue", null);
        setField(term865, term865.getClass(), "propListHead", term888);
        setIntField(term865, term865.getClass(), "sourcePosition", -75206835);
        setField(term865, term865.getClass(), "jsType", null);
        setField(term865, term865.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term838;
        args[1] = term865;
        args[2] = "xOEqzGAmDU";
        try {
            callMethod(klass, "isVariableStillLiveWithinExpression", argTypes, term821, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


