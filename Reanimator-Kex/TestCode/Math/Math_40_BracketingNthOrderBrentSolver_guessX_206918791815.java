package org.apache.commons.math.analysis.solvers;

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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.analysis.solvers.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;
import java.lang.Double;
import java.lang.Integer;

public class BracketingNthOrderBrentSolver_guessX_206918791815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term756;
     Object term780;
     Object term782;
     Object term788;
     Object term793;
     Object term795;
     Object term7719;
     Object term7725;
     Object term7726;

    public BracketingNthOrderBrentSolver_guessX_206918791815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7728 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term7727 = ((Class) term7728).getDeclaredField((String) "ANY_SIDE");
        ((Field) term7727).setAccessible(true);
        Object enum12 = ((Field) term7727).get((Object) null);
        term756 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term773 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term776 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        setIntField(term756, term756.getClass(), "maximalOrder", 5);
        setField(term756, term756.getClass(), "allowed", enum12);
        setDoubleField(term756, term756.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term756, term756.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term756, term756.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term773, term773.getClass(), "maximalCount", 0);
        setIntField(term773, term773.getClass(), "count", 0);
        setField(term773, term773.getClass(), "maxCountCallback", term776);
        setField(term756, term756.getClass(), "evaluations", term773);
        setDoubleField(term756, term756.getClass(), "searchMin", 0.7655020693602768);
        setDoubleField(term756, term756.getClass(), "searchMax", 0.1374549299694151);
        setDoubleField(term756, term756.getClass(), "searchStart", 0.7031006357544823);
        setField(term756, term756.getClass(), "function", null);
        term780 = new Double(0.9527281779865117);
        term782 = (double[]) newDoubleArray(5);
        setDoubleElement(term782, 0, 0.9828442029246764);
        setDoubleElement(term782, 1, 0.2779719046761513);
        setDoubleElement(term782, 2, 0.6436713023569729);
        setDoubleElement(term782, 3, 0.7332741045694002);
        setDoubleElement(term782, 4, 0.4569171842750229);
        term788 = (double[]) newDoubleArray(4);
        setDoubleElement(term788, 0, 0.8598297828918529);
        setDoubleElement(term788, 1, 0.43692187681405226);
        setDoubleElement(term788, 2, 0.7633268466829064);
        setDoubleElement(term788, 3, 0.13481025392611334);
        term793 = new Integer(391863371);
        term795 = new Integer(-1922583790);
        Class<? extends Object> term8048 = Class.forName((String) "org.apache.commons.math.analysis.solvers.AllowedSolution");
        Field term8047 = ((Class) term8048).getDeclaredField((String) "ANY_SIDE");
        ((Field) term8047).setAccessible(true);
        Object enum13 = ((Field) term8047).get((Object) null);
        term7719 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver"));
        Object term7723 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor"));
        Object term7724 = newInstance(Class.forName("org.apache.commons.math.util.Incrementor$1"));
        setIntField(term7719, term7719.getClass(), "maximalOrder", 5);
        setField(term7719, term7719.getClass(), "allowed", enum13);
        setDoubleField(term7719, term7719.getClass(), "functionValueAccuracy", 1.0E-15);
        setDoubleField(term7719, term7719.getClass(), "absoluteAccuracy", 1.0E-6);
        setDoubleField(term7719, term7719.getClass(), "relativeAccuracy", 1.0E-14);
        setIntField(term7723, term7723.getClass(), "maximalCount", 0);
        setIntField(term7723, term7723.getClass(), "count", 0);
        setField(term7723, term7723.getClass(), "maxCountCallback", term7724);
        setField(term7719, term7719.getClass(), "evaluations", term7723);
        setDoubleField(term7719, term7719.getClass(), "searchMin", 0.7655020693602768);
        setDoubleField(term7719, term7719.getClass(), "searchMax", 0.1374549299694151);
        setDoubleField(term7719, term7719.getClass(), "searchStart", 0.7031006357544823);
        setField(term7719, term7719.getClass(), "function", null);
        term7725 = (double[]) newDoubleArray(5);
        setDoubleElement(term7725, 0, 0.9828442029246764);
        setDoubleElement(term7725, 1, 0.2779719046761513);
        setDoubleElement(term7725, 2, 0.6436713023569729);
        setDoubleElement(term7725, 3, 0.7332741045694002);
        setDoubleElement(term7725, 4, 0.4569171842750229);
        term7726 = (double[]) newDoubleArray(4);
        setDoubleElement(term7726, 0, 0.8598297828918529);
        setDoubleElement(term7726, 1, 0.43692187681405226);
        setDoubleElement(term7726, 2, 0.7633268466829064);
        setDoubleElement(term7726, 3, 0.13481025392611334);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BracketingNthOrderBrentSolver");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = term780;
        args[1] = term782;
        args[2] = term788;
        args[3] = term793;
        args[4] = term795;
        Object retValue = callMethod(klass, "guessX", argTypes, term756, args);
        assertTrue(recursiveEquals(term756, term7719));
        assertTrue(recursiveEquals(term780, 0.9527281779865117));
        assertTrue(recursiveEquals(term782, term7725));
        assertTrue(recursiveEquals(term788, term7726));
        assertTrue(recursiveEquals(term793, 391863371));
        assertTrue(recursiveEquals(term795, -1922583790));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


