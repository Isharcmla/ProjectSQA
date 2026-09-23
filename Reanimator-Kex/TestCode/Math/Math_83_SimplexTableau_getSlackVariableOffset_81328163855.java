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

public class SimplexTableau_getSlackVariableOffset_81328163855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11139;
     Object term48988;

    public SimplexTableau_getSlackVariableOffset_81328163855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49004 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49003 = ((Class) term49004).getDeclaredField((String) "GEQ");
        ((Field) term49003).setAccessible(true);
        Object enum120 = ((Field) term49003).get((Object) null);
        Object term11144 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11144, term11144.getClass(), "coefficients", null);
        setField(term11144, term11144.getClass(), "relationship", enum120);
        setDoubleField(term11144, term11144.getClass(), "value", 0.05880719443135807);
        Object term11148 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11148, term11148.getClass(), "coefficients", null);
        setField(term11148, term11148.getClass(), "relationship", enum120);
        setDoubleField(term11148, term11148.getClass(), "value", 0.34010089048558567);
        Class<? extends Object> term49300 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49299 = ((Class) term49300).getDeclaredField((String) "LEQ");
        ((Field) term49299).setAccessible(true);
        Object enum121 = ((Field) term49299).get((Object) null);
        Object term11150 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11150, term11150.getClass(), "coefficients", null);
        setField(term11150, term11150.getClass(), "relationship", enum121);
        setDoubleField(term11150, term11150.getClass(), "value", 0.19625398866403143);
        Object term11154 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11154, term11154.getClass(), "coefficients", null);
        setField(term11154, term11154.getClass(), "relationship", enum121);
        setDoubleField(term11154, term11154.getClass(), "value", 0.45069204793711093);
        Object term11156 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11156, term11156.getClass(), "coefficients", null);
        setField(term11156, term11156.getClass(), "relationship", enum121);
        setDoubleField(term11156, term11156.getClass(), "value", 0.9341364461850963);
        Object term11158 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11158, term11158.getClass(), "coefficients", null);
        setField(term11158, term11158.getClass(), "relationship", enum121);
        setDoubleField(term11158, term11158.getClass(), "value", 0.9022041121474429);
        Class<? extends Object> term49596 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49595 = ((Class) term49596).getDeclaredField((String) "EQ");
        ((Field) term49595).setAccessible(true);
        Object enum122 = ((Field) term49595).get((Object) null);
        Object term11160 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11160, term11160.getClass(), "coefficients", null);
        setField(term11160, term11160.getClass(), "relationship", enum122);
        setDoubleField(term11160, term11160.getClass(), "value", 0.6512870939318848);
        Object term11164 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11164, term11164.getClass(), "coefficients", null);
        setField(term11164, term11164.getClass(), "relationship", null);
        setDoubleField(term11164, term11164.getClass(), "value", 0.0);
        ArrayList term11142 = new ArrayList();
        ((ArrayList) term11142).add(term11144);
        ((ArrayList) term11142).add(term11148);
        ((ArrayList) term11142).add(term11150);
        ((ArrayList) term11142).add(term11154);
        ((ArrayList) term11142).add(term11156);
        ((ArrayList) term11142).add(term11158);
        ((ArrayList) term11142).add(term11160);
        ((ArrayList) term11142).add(term11164);
        term11139 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term11140 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term11140, term11140.getClass(), "coefficients", null);
        setDoubleField(term11140, term11140.getClass(), "constantTerm", 0.9511861072660375);
        setField(term11139, term11139.getClass(), "f", term11140);
        setField(term11139, term11139.getClass(), "constraints", term11142);
        setBooleanField(term11139, term11139.getClass(), "restrictToNonNegative", true);
        setField(term11139, term11139.getClass(), "tableau", null);
        setIntField(term11139, term11139.getClass(), "numDecisionVariables", 0);
        setIntField(term11139, term11139.getClass(), "numSlackVariables", 0);
        setIntField(term11139, term11139.getClass(), "numArtificialVariables", 0);
        setDoubleField(term11139, term11139.getClass(), "epsilon", 0.0);
        Class<? extends Object> term49891 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49890 = ((Class) term49891).getDeclaredField((String) "LEQ");
        ((Field) term49890).setAccessible(true);
        Object enum123 = ((Field) term49890).get((Object) null);
        Object term48992 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48992, term48992.getClass(), "coefficients", null);
        setField(term48992, term48992.getClass(), "relationship", enum123);
        setDoubleField(term48992, term48992.getClass(), "value", 0.05880719443135807);
        Object term48994 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48994, term48994.getClass(), "coefficients", null);
        setField(term48994, term48994.getClass(), "relationship", enum123);
        setDoubleField(term48994, term48994.getClass(), "value", 0.34010089048558567);
        Class<? extends Object> term50219 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50218 = ((Class) term50219).getDeclaredField((String) "LEQ");
        ((Field) term50218).setAccessible(true);
        Object enum124 = ((Field) term50218).get((Object) null);
        Object term48995 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48995, term48995.getClass(), "coefficients", null);
        setField(term48995, term48995.getClass(), "relationship", enum124);
        setDoubleField(term48995, term48995.getClass(), "value", 0.19625398866403143);
        Object term48997 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48997, term48997.getClass(), "coefficients", null);
        setField(term48997, term48997.getClass(), "relationship", enum124);
        setDoubleField(term48997, term48997.getClass(), "value", 0.45069204793711093);
        Object term48998 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48998, term48998.getClass(), "coefficients", null);
        setField(term48998, term48998.getClass(), "relationship", enum124);
        setDoubleField(term48998, term48998.getClass(), "value", 0.9341364461850963);
        Object term48999 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term48999, term48999.getClass(), "coefficients", null);
        setField(term48999, term48999.getClass(), "relationship", enum124);
        setDoubleField(term48999, term48999.getClass(), "value", 0.9022041121474429);
        Class<? extends Object> term50515 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50514 = ((Class) term50515).getDeclaredField((String) "EQ");
        ((Field) term50514).setAccessible(true);
        Object enum125 = ((Field) term50514).get((Object) null);
        Object term49000 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49000, term49000.getClass(), "coefficients", null);
        setField(term49000, term49000.getClass(), "relationship", enum125);
        setDoubleField(term49000, term49000.getClass(), "value", 0.6512870939318848);
        Object term49002 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49002, term49002.getClass(), "coefficients", null);
        setField(term49002, term49002.getClass(), "relationship", null);
        setDoubleField(term49002, term49002.getClass(), "value", 0.0);
        ArrayList term48990 = new ArrayList();
        ((ArrayList) term48990).add(term48992);
        ((ArrayList) term48990).add(term48994);
        ((ArrayList) term48990).add(term48995);
        ((ArrayList) term48990).add(term48997);
        ((ArrayList) term48990).add(term48998);
        ((ArrayList) term48990).add(term48999);
        ((ArrayList) term48990).add(term49000);
        ((ArrayList) term48990).add(term49002);
        term48988 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term48989 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term48989, term48989.getClass(), "coefficients", null);
        setDoubleField(term48989, term48989.getClass(), "constantTerm", 0.9511861072660375);
        setField(term48988, term48988.getClass(), "f", term48989);
        setField(term48988, term48988.getClass(), "constraints", term48990);
        setBooleanField(term48988, term48988.getClass(), "restrictToNonNegative", true);
        setField(term48988, term48988.getClass(), "tableau", null);
        setIntField(term48988, term48988.getClass(), "numDecisionVariables", 0);
        setIntField(term48988, term48988.getClass(), "numSlackVariables", 0);
        setIntField(term48988, term48988.getClass(), "numArtificialVariables", 0);
        setDoubleField(term48988, term48988.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSlackVariableOffset", argTypes, term11139, args);
        assertTrue(recursiveEquals(term11139, term48988));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


