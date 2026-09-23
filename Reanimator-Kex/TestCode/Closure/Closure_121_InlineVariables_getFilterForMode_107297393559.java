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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class InlineVariables_getFilterForMode_107297393559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55557;
     Object term57233;
     Object enum97;

    public InlineVariables_getFilterForMode_107297393559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term57238 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term57237 = ((Class) term57238).getDeclaredField((String) "ALL");
        ((Field) term57237).setAccessible(true);
        Object enum95 = ((Field) term57237).get((Object) null);
        term55557 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term55557, term55557.getClass(), "mode", enum95);
        Class<? extends Object> term57499 = Class.forName((String) "com.google.javascript.jscomp.InlineVariables$Mode");
        Field term57498 = ((Class) term57499).getDeclaredField((String) "ALL");
        ((Field) term57498).setAccessible(true);
        Object enum96 = ((Field) term57498).get((Object) null);
        term57233 = newInstance(Class.forName("com.google.javascript.jscomp.InlineVariables"));
        setField(term57233, term57233.getClass(), "compiler", null);
        setField(term57233, term57233.getClass(), "mode", enum96);
        setBooleanField(term57233, term57233.getClass(), "inlineAllStrings", false);
        setField(term57233, term57233.getClass(), "identifyConstants", null);
        Class<? extends Object> term57760 = Class.forName((String) "com.google.common.base.Predicates$ObjectPredicate");
        Field term57759 = ((Class) term57760).getDeclaredField((String) "ALWAYS_TRUE");
        ((Field) term57759).setAccessible(true);
        enum97 = ((Field) term57759).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineVariables");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFilterForMode", argTypes, term55557, args);
        assertTrue(recursiveEquals(term55557, term57233));
        assertTrue(recursiveEquals(retValue, enum97));
    }

};


