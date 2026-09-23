package org.apache.commons.math.optimization.linear;

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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getNormalizedConstraints_92657352834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1856;
     Object term28002;
     Object term27986;

    public SimplexTableau_getNormalizedConstraints_92657352834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28022 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term28021 = ((Class) term28022).getDeclaredField((String) "EQ");
        ((Field) term28021).setAccessible(true);
        Object enum66 = ((Field) term28021).get((Object) null);
        Object term1861 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1861, term1861.getClass(), "coefficients", null);
        setField(term1861, term1861.getClass(), "relationship", enum66);
        setDoubleField(term1861, term1861.getClass(), "value", 0.9527281779865117);
        Class<? extends Object> term28315 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term28314 = ((Class) term28315).getDeclaredField((String) "LEQ");
        ((Field) term28314).setAccessible(true);
        Object enum67 = ((Field) term28314).get((Object) null);
        Object term1865 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1865, term1865.getClass(), "coefficients", null);
        setField(term1865, term1865.getClass(), "relationship", enum67);
        setDoubleField(term1865, term1865.getClass(), "value", 0.9828442029246764);
        Object term1869 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1869, term1869.getClass(), "coefficients", null);
        setField(term1869, term1869.getClass(), "relationship", enum66);
        setDoubleField(term1869, term1869.getClass(), "value", 0.2779719046761513);
        Object term1871 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1871, term1871.getClass(), "coefficients", null);
        setField(term1871, term1871.getClass(), "relationship", enum67);
        setDoubleField(term1871, term1871.getClass(), "value", 0.6436713023569729);
        Object term1873 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1873, term1873.getClass(), "coefficients", null);
        setField(term1873, term1873.getClass(), "relationship", enum66);
        setDoubleField(term1873, term1873.getClass(), "value", 0.7332741045694002);
        Class<? extends Object> term28611 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term28610 = ((Class) term28611).getDeclaredField((String) "LEQ");
        ((Field) term28610).setAccessible(true);
        Object enum68 = ((Field) term28610).get((Object) null);
        Object term1875 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term1875, term1875.getClass(), "coefficients", null);
        setField(term1875, term1875.getClass(), "relationship", enum68);
        setDoubleField(term1875, term1875.getClass(), "value", 0.4569171842750229);
        ArrayList term1859 = new ArrayList();
        ((ArrayList) term1859).add(term1861);
        ((ArrayList) term1859).add(term1865);
        ((ArrayList) term1859).add(term1869);
        ((ArrayList) term1859).add(term1871);
        ((ArrayList) term1859).add(term1873);
        ((ArrayList) term1859).add(term1875);
        term1856 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term1857 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term1857, term1857.getClass(), "coefficients", null);
        setDoubleField(term1857, term1857.getClass(), "constantTerm", 0.7031006357544823);
        setField(term1856, term1856.getClass(), "f", term1857);
        setField(term1856, term1856.getClass(), "constraints", term1859);
        setBooleanField(term1856, term1856.getClass(), "restrictToNonNegative", false);
        setField(term1856, term1856.getClass(), "tableau", null);
        setIntField(term1856, term1856.getClass(), "numDecisionVariables", -1955890973);
        setIntField(term1856, term1856.getClass(), "numSlackVariables", -2038273078);
        setIntField(term1856, term1856.getClass(), "numArtificialVariables", 1227103734);
        setDoubleField(term1856, term1856.getClass(), "epsilon", 0.8598297828918529);
        Class<? extends Object> term28907 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term28906 = ((Class) term28907).getDeclaredField((String) "LEQ");
        ((Field) term28906).setAccessible(true);
        Object enum69 = ((Field) term28906).get((Object) null);
        Object term28006 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term28006, term28006.getClass(), "coefficients", null);
        setField(term28006, term28006.getClass(), "relationship", enum69);
        setDoubleField(term28006, term28006.getClass(), "value", 0.9527281779865117);
        Class<? extends Object> term29203 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term29202 = ((Class) term29203).getDeclaredField((String) "GEQ");
        ((Field) term29202).setAccessible(true);
        Object enum70 = ((Field) term29202).get((Object) null);
        Object term28010 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term28010, term28010.getClass(), "coefficients", null);
        setField(term28010, term28010.getClass(), "relationship", enum70);
        setDoubleField(term28010, term28010.getClass(), "value", 0.9828442029246764);
        Object term28014 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term28014, term28014.getClass(), "coefficients", null);
        setField(term28014, term28014.getClass(), "relationship", enum69);
        setDoubleField(term28014, term28014.getClass(), "value", 0.2779719046761513);
        Object term28015 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term28015, term28015.getClass(), "coefficients", null);
        setField(term28015, term28015.getClass(), "relationship", enum70);
        setDoubleField(term28015, term28015.getClass(), "value", 0.6436713023569729);
        Object term28016 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term28016, term28016.getClass(), "coefficients", null);
        setField(term28016, term28016.getClass(), "relationship", enum69);
        setDoubleField(term28016, term28016.getClass(), "value", 0.7332741045694002);
        Class<? extends Object> term29499 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term29498 = ((Class) term29499).getDeclaredField((String) "LEQ");
        ((Field) term29498).setAccessible(true);
        Object enum71 = ((Field) term29498).get((Object) null);
        Object term28017 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term28017, term28017.getClass(), "coefficients", null);
        setField(term28017, term28017.getClass(), "relationship", enum71);
        setDoubleField(term28017, term28017.getClass(), "value", 0.4569171842750229);
        ArrayList term28004 = new ArrayList();
        ((ArrayList) term28004).add(term28006);
        ((ArrayList) term28004).add(term28010);
        ((ArrayList) term28004).add(term28014);
        ((ArrayList) term28004).add(term28015);
        ((ArrayList) term28004).add(term28016);
        ((ArrayList) term28004).add(term28017);
        term28002 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term28003 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term28003, term28003.getClass(), "coefficients", null);
        setDoubleField(term28003, term28003.getClass(), "constantTerm", 0.7031006357544823);
        setField(term28002, term28002.getClass(), "f", term28003);
        setField(term28002, term28002.getClass(), "constraints", term28004);
        setBooleanField(term28002, term28002.getClass(), "restrictToNonNegative", false);
        setField(term28002, term28002.getClass(), "tableau", null);
        setIntField(term28002, term28002.getClass(), "numDecisionVariables", -1955890973);
        setIntField(term28002, term28002.getClass(), "numSlackVariables", -2038273078);
        setIntField(term28002, term28002.getClass(), "numArtificialVariables", 1227103734);
        setDoubleField(term28002, term28002.getClass(), "epsilon", 0.8598297828918529);
        Class<? extends Object> term29795 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term29794 = ((Class) term29795).getDeclaredField((String) "LEQ");
        ((Field) term29794).setAccessible(true);
        Object enum72 = ((Field) term29794).get((Object) null);
        Object term27988 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term27988, term27988.getClass(), "coefficients", null);
        setField(term27988, term27988.getClass(), "relationship", enum72);
        setDoubleField(term27988, term27988.getClass(), "value", 0.9527281779865117);
        Class<? extends Object> term30091 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term30090 = ((Class) term30091).getDeclaredField((String) "LEQ");
        ((Field) term30090).setAccessible(true);
        Object enum73 = ((Field) term30090).get((Object) null);
        Object term27990 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term27990, term27990.getClass(), "coefficients", null);
        setField(term27990, term27990.getClass(), "relationship", enum73);
        setDoubleField(term27990, term27990.getClass(), "value", 0.9828442029246764);
        Object term27992 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term27992, term27992.getClass(), "coefficients", null);
        setField(term27992, term27992.getClass(), "relationship", enum72);
        setDoubleField(term27992, term27992.getClass(), "value", 0.2779719046761513);
        Object term27994 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term27994, term27994.getClass(), "coefficients", null);
        setField(term27994, term27994.getClass(), "relationship", enum73);
        setDoubleField(term27994, term27994.getClass(), "value", 0.6436713023569729);
        Object term27996 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term27996, term27996.getClass(), "coefficients", null);
        setField(term27996, term27996.getClass(), "relationship", enum72);
        setDoubleField(term27996, term27996.getClass(), "value", 0.7332741045694002);
        Class<? extends Object> term30387 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term30386 = ((Class) term30387).getDeclaredField((String) "GEQ");
        ((Field) term30386).setAccessible(true);
        Object enum74 = ((Field) term30386).get((Object) null);
        Object term27998 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term27998, term27998.getClass(), "coefficients", null);
        setField(term27998, term27998.getClass(), "relationship", enum74);
        setDoubleField(term27998, term27998.getClass(), "value", 0.4569171842750229);
        term27986 = new ArrayList();
        ((ArrayList) term27986).add(term27988);
        ((ArrayList) term27986).add(term27990);
        ((ArrayList) term27986).add(term27992);
        ((ArrayList) term27986).add(term27994);
        ((ArrayList) term27986).add(term27996);
        ((ArrayList) term27986).add(term27998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNormalizedConstraints", argTypes, term1856, args);
        assertTrue(recursiveEquals(term1856, term28002));
        assertTrue(recursiveEquals(retValue, term27986));
    }

};


