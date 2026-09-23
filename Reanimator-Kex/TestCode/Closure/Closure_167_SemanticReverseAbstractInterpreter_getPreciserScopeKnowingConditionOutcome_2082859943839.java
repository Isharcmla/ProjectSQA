package com.google.javascript.jscomp.type;

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
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.type.EqualityUtils.*;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260048;
     Object term260140;
     Object term260844;
     Object term260845;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_2082859943839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260048 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term260140 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term260232 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term260328 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term260420 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term260544 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term260140, term260140.getClass(), "type", 12);
        setIntField(term260232, term260232.getClass(), "type", 1);
        setField(term260232, term260232.getClass(), "jsType", term260328);
        setField(term260140, term260140.getClass(), "first", term260232);
        setIntField(term260420, term260420.getClass(), "type", 12);
        setField(term260420, term260420.getClass(), "jsType", term260544);
        setField(term260140, term260140.getClass(), "last", term260420);
        term260844 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(term260844, term260844.getClass(), "INEQ", null);
        setField(term260844, term260844.getClass(), "convention", null);
        setField(term260844, term260844.getClass(), "typeRegistry", null);
        setField(term260844, term260844.getClass(), "firstLink", null);
        setField(term260844, term260844.getClass(), "nextLink", null);
        setField(term260844, term260844.getClass(), "restrictUndefinedVisitor", null);
        setField(term260844, term260844.getClass(), "restrictNullVisitor", null);
        term260845 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term260846 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term260847 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        Object term260848 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term260849 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setDoubleField(term260845, term260845.getClass(), "number", 0.0);
        setIntField(term260845, term260845.getClass(), "type", 12);
        setField(term260845, term260845.getClass(), "next", null);
        setDoubleField(term260846, term260846.getClass(), "number", 0.0);
        setIntField(term260846, term260846.getClass(), "type", 1);
        setField(term260846, term260846.getClass(), "next", null);
        setField(term260846, term260846.getClass(), "first", null);
        setField(term260846, term260846.getClass(), "last", null);
        setField(term260846, term260846.getClass(), "propListHead", null);
        setIntField(term260846, term260846.getClass(), "sourcePosition", 0);
        setField(term260847, term260847.getClass(), "properties", null);
        setBooleanField(term260847, term260847.getClass(), "declared", false);
        setBooleanField(term260847, term260847.getClass(), "isFrozen", false);
        setField(term260847, term260847.getClass(), "className", null);
        setField(term260847, term260847.getClass(), "properties", null);
        setBooleanField(term260847, term260847.getClass(), "nativeType", false);
        setField(term260847, term260847.getClass(), "implicitPrototypeFallback", null);
        setField(term260847, term260847.getClass(), "ownerFunction", null);
        setBooleanField(term260847, term260847.getClass(), "prettyPrint", false);
        setBooleanField(term260847, term260847.getClass(), "visited", false);
        setField(term260847, term260847.getClass(), "docInfo", null);
        setBooleanField(term260847, term260847.getClass(), "unknown", false);
        setBooleanField(term260847, term260847.getClass(), "resolved", false);
        setField(term260847, term260847.getClass(), "resolveResult", null);
        setBooleanField(term260847, term260847.getClass(), "inTemplatedCheckVisit", false);
        setField(term260847, term260847.getClass(), "registry", null);
        setField(term260846, term260846.getClass(), "jsType", term260847);
        setField(term260846, term260846.getClass(), "parent", null);
        setField(term260845, term260845.getClass(), "first", term260846);
        setDoubleField(term260848, term260848.getClass(), "number", 0.0);
        setIntField(term260848, term260848.getClass(), "type", 12);
        setField(term260848, term260848.getClass(), "next", null);
        setField(term260848, term260848.getClass(), "first", null);
        setField(term260848, term260848.getClass(), "last", null);
        setField(term260848, term260848.getClass(), "propListHead", null);
        setIntField(term260848, term260848.getClass(), "sourcePosition", 0);
        setField(term260849, term260849.getClass(), "typeExpr", null);
        setField(term260849, term260849.getClass(), "sourceName", null);
        setBooleanField(term260849, term260849.getClass(), "isChecked", false);
        setBooleanField(term260849, term260849.getClass(), "visited", false);
        setField(term260849, term260849.getClass(), "docInfo", null);
        setBooleanField(term260849, term260849.getClass(), "unknown", false);
        setBooleanField(term260849, term260849.getClass(), "resolved", false);
        setField(term260849, term260849.getClass(), "resolveResult", null);
        setBooleanField(term260849, term260849.getClass(), "inTemplatedCheckVisit", false);
        setField(term260849, term260849.getClass(), "registry", null);
        setField(term260848, term260848.getClass(), "jsType", term260849);
        setField(term260848, term260848.getClass(), "parent", null);
        setField(term260845, term260845.getClass(), "last", term260848);
        setField(term260845, term260845.getClass(), "propListHead", null);
        setIntField(term260845, term260845.getClass(), "sourcePosition", 0);
        setField(term260845, term260845.getClass(), "jsType", null);
        setField(term260845, term260845.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term260140;
        args[1] = null;
        args[2] = true;
        Object retValue = callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term260048, args);
        assertTrue(recursiveEquals(term260048, term260844));
        assertTrue(recursiveEquals(term260140, term260845));
        assertTrue(recursiveEquals(retValue, null));
    }

};


