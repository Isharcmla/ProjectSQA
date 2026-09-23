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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481403;
     Object term481495;

    public SemanticReverseAbstractInterpreter_getPreciserScopeKnowingConditionOutcome_20828599431021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481403 = newInstance(Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        term481495 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term481587 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term481687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term481787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term481887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term481987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term482987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term483987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term484987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term485987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486287 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486487 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486687 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486887 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term486999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        Object term487091 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term487187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setIntField(term481495, term481495.getClass(), "type", 13);
        setIntField(term481587, term481587.getClass(), "type", 0);
        setField(term486887, term486887.getClass(), "referencedType", term486999);
        setField(term486787, term486787.getClass(), "referencedType", term486887);
        setField(term486687, term486687.getClass(), "referencedType", term486787);
        setField(term486587, term486587.getClass(), "referencedType", term486687);
        setField(term486487, term486487.getClass(), "referencedType", term486587);
        setField(term486387, term486387.getClass(), "referencedType", term486487);
        setField(term486287, term486287.getClass(), "referencedType", term486387);
        setField(term486187, term486187.getClass(), "referencedType", term486287);
        setField(term486087, term486087.getClass(), "referencedType", term486187);
        setField(term485987, term485987.getClass(), "referencedType", term486087);
        setField(term485887, term485887.getClass(), "referencedType", term485987);
        setField(term485787, term485787.getClass(), "referencedType", term485887);
        setField(term485687, term485687.getClass(), "referencedType", term485787);
        setField(term485587, term485587.getClass(), "referencedType", term485687);
        setField(term485487, term485487.getClass(), "referencedType", term485587);
        setField(term485387, term485387.getClass(), "referencedType", term485487);
        setField(term485287, term485287.getClass(), "referencedType", term485387);
        setField(term485187, term485187.getClass(), "referencedType", term485287);
        setField(term485087, term485087.getClass(), "referencedType", term485187);
        setField(term484987, term484987.getClass(), "referencedType", term485087);
        setField(term484887, term484887.getClass(), "referencedType", term484987);
        setField(term484787, term484787.getClass(), "referencedType", term484887);
        setField(term484687, term484687.getClass(), "referencedType", term484787);
        setField(term484587, term484587.getClass(), "referencedType", term484687);
        setField(term484487, term484487.getClass(), "referencedType", term484587);
        setField(term484387, term484387.getClass(), "referencedType", term484487);
        setField(term484287, term484287.getClass(), "referencedType", term484387);
        setField(term484187, term484187.getClass(), "referencedType", term484287);
        setField(term484087, term484087.getClass(), "referencedType", term484187);
        setField(term483987, term483987.getClass(), "referencedType", term484087);
        setField(term483887, term483887.getClass(), "referencedType", term483987);
        setField(term483787, term483787.getClass(), "referencedType", term483887);
        setField(term483687, term483687.getClass(), "referencedType", term483787);
        setField(term483587, term483587.getClass(), "referencedType", term483687);
        setField(term483487, term483487.getClass(), "referencedType", term483587);
        setField(term483387, term483387.getClass(), "referencedType", term483487);
        setField(term483287, term483287.getClass(), "referencedType", term483387);
        setField(term483187, term483187.getClass(), "referencedType", term483287);
        setField(term483087, term483087.getClass(), "referencedType", term483187);
        setField(term482987, term482987.getClass(), "referencedType", term483087);
        setField(term482887, term482887.getClass(), "referencedType", term482987);
        setField(term482787, term482787.getClass(), "referencedType", term482887);
        setField(term482687, term482687.getClass(), "referencedType", term482787);
        setField(term482587, term482587.getClass(), "referencedType", term482687);
        setField(term482487, term482487.getClass(), "referencedType", term482587);
        setField(term482387, term482387.getClass(), "referencedType", term482487);
        setField(term482287, term482287.getClass(), "referencedType", term482387);
        setField(term482187, term482187.getClass(), "referencedType", term482287);
        setField(term482087, term482087.getClass(), "referencedType", term482187);
        setField(term481987, term481987.getClass(), "referencedType", term482087);
        setField(term481887, term481887.getClass(), "referencedType", term481987);
        setField(term481787, term481787.getClass(), "referencedType", term481887);
        setField(term481687, term481687.getClass(), "referencedType", term481787);
        setField(term481587, term481587.getClass(), "jsType", term481687);
        setField(term481495, term481495.getClass(), "first", term481587);
        setIntField(term487091, term487091.getClass(), "type", 0);
        setField(term487091, term487091.getClass(), "jsType", term487187);
        setField(term481495, term481495.getClass(), "last", term487091);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term481495;
        args[1] = null;
        args[2] = false;
        try {
            callMethod(klass, "getPreciserScopeKnowingConditionOutcome", argTypes, term481403, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


