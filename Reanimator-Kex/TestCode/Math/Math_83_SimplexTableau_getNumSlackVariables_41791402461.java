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

public class SimplexTableau_getNumSlackVariables_41791402461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15720;
     Object term56514;

    public SimplexTableau_getNumSlackVariables_41791402461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term56793 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term56792 = ((Class) term56793).getDeclaredField((String) "LEQ");
        ((Field) term56792).setAccessible(true);
        Object enum145 = ((Field) term56792).get((Object) null);
        Object term15725 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15725, term15725.getClass(), "coefficients", null);
        setField(term15725, term15725.getClass(), "relationship", enum145);
        setDoubleField(term15725, term15725.getClass(), "value", 0.8490790645379176);
        Class<? extends Object> term57093 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term57092 = ((Class) term57093).getDeclaredField((String) "LEQ");
        ((Field) term57092).setAccessible(true);
        Object enum146 = ((Field) term57092).get((Object) null);
        Object term15729 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15729, term15729.getClass(), "coefficients", null);
        setField(term15729, term15729.getClass(), "relationship", enum146);
        setDoubleField(term15729, term15729.getClass(), "value", 0.23129126164078717);
        ArrayList term15723 = new ArrayList();
        ((ArrayList) term15723).add(term15725);
        ((ArrayList) term15723).add(term15729);
        term15720 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term15721 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term15721, term15721.getClass(), "coefficients", null);
        setDoubleField(term15721, term15721.getClass(), "constantTerm", 0.06480976831423468);
        setField(term15720, term15720.getClass(), "f", term15721);
        setField(term15720, term15720.getClass(), "constraints", term15723);
        setBooleanField(term15720, term15720.getClass(), "restrictToNonNegative", false);
        setField(term15720, term15720.getClass(), "tableau", null);
        setIntField(term15720, term15720.getClass(), "numDecisionVariables", 1063420942);
        setIntField(term15720, term15720.getClass(), "numSlackVariables", 1375330971);
        setIntField(term15720, term15720.getClass(), "numArtificialVariables", -478195677);
        setDoubleField(term15720, term15720.getClass(), "epsilon", 0.6047138318674447);
        Class<? extends Object> term57402 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term57401 = ((Class) term57402).getDeclaredField((String) "EQ");
        ((Field) term57401).setAccessible(true);
        Object enum147 = ((Field) term57401).get((Object) null);
        Object term56561 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term56561, term56561.getClass(), "coefficients", null);
        setField(term56561, term56561.getClass(), "relationship", enum147);
        setDoubleField(term56561, term56561.getClass(), "value", 0.8490790645379176);
        Object term56563 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term56563, term56563.getClass(), "coefficients", null);
        setField(term56563, term56563.getClass(), "relationship", enum147);
        setDoubleField(term56563, term56563.getClass(), "value", 0.23129126164078717);
        ArrayList term56558 = new ArrayList();
        ((ArrayList) term56558).add(term56561);
        ((ArrayList) term56558).add(term56563);
        term56514 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term56531 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term56531, term56531.getClass(), "coefficients", null);
        setDoubleField(term56531, term56531.getClass(), "constantTerm", 0.06480976831423468);
        setField(term56514, term56514.getClass(), "f", term56531);
        setField(term56514, term56514.getClass(), "constraints", term56558);
        setBooleanField(term56514, term56514.getClass(), "restrictToNonNegative", false);
        setField(term56514, term56514.getClass(), "tableau", null);
        setIntField(term56514, term56514.getClass(), "numDecisionVariables", 1063420942);
        setIntField(term56514, term56514.getClass(), "numSlackVariables", 1375330971);
        setIntField(term56514, term56514.getClass(), "numArtificialVariables", -478195677);
        setDoubleField(term56514, term56514.getClass(), "epsilon", 0.6047138318674447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumSlackVariables", argTypes, term15720, args);
        assertTrue(recursiveEquals(term15720, term56514));
        assertTrue(recursiveEquals(retValue, 1375330971));
    }

};


