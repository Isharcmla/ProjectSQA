package com.google.gson.internal;

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
import static com.google.gson.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.EqualityUtils.*;
import java.lang.Object;
import org.mockito.Mockito;

public class _Gson_Types_resolve_1298521219165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91421;
     Object term103367;
     Object term103362;

    public _Gson_Types_resolve_1298521219165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91421 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term91541 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term91661 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term91781 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term91901 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term92021 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term92141 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term92261 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term92381 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term92501 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term92621 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term92741 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term92861 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term92981 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term93101 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term93221 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term93341 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term93461 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term93581 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term93701 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term93821 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term93941 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term94061 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term94181 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term94301 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term94421 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term94541 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term94661 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term94781 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term94901 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term95021 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term95141 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term95261 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term95381 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term95501 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term95621 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term95741 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term95861 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term95981 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term96101 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term96221 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term96341 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term96461 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term96581 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term96701 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term96821 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term96941 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term97061 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term97181 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term97301 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term97421 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term97541 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term97661 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term97781 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term97901 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term98021 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term98141 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term98261 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term98381 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term98501 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term98621 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term90785 = Mockito.mock(Class.forName("java.lang.reflect.TypeVariable"));
        setField(term98621, term98621.getClass(), "componentType", term90785);
        setField(term98501, term98501.getClass(), "componentType", term98621);
        setField(term98381, term98381.getClass(), "componentType", term98501);
        setField(term98261, term98261.getClass(), "componentType", term98381);
        setField(term98141, term98141.getClass(), "componentType", term98261);
        setField(term98021, term98021.getClass(), "componentType", term98141);
        setField(term97901, term97901.getClass(), "componentType", term98021);
        setField(term97781, term97781.getClass(), "componentType", term97901);
        setField(term97661, term97661.getClass(), "componentType", term97781);
        setField(term97541, term97541.getClass(), "componentType", term97661);
        setField(term97421, term97421.getClass(), "componentType", term97541);
        setField(term97301, term97301.getClass(), "componentType", term97421);
        setField(term97181, term97181.getClass(), "componentType", term97301);
        setField(term97061, term97061.getClass(), "componentType", term97181);
        setField(term96941, term96941.getClass(), "componentType", term97061);
        setField(term96821, term96821.getClass(), "componentType", term96941);
        setField(term96701, term96701.getClass(), "componentType", term96821);
        setField(term96581, term96581.getClass(), "componentType", term96701);
        setField(term96461, term96461.getClass(), "componentType", term96581);
        setField(term96341, term96341.getClass(), "componentType", term96461);
        setField(term96221, term96221.getClass(), "componentType", term96341);
        setField(term96101, term96101.getClass(), "componentType", term96221);
        setField(term95981, term95981.getClass(), "componentType", term96101);
        setField(term95861, term95861.getClass(), "componentType", term95981);
        setField(term95741, term95741.getClass(), "componentType", term95861);
        setField(term95621, term95621.getClass(), "componentType", term95741);
        setField(term95501, term95501.getClass(), "componentType", term95621);
        setField(term95381, term95381.getClass(), "componentType", term95501);
        setField(term95261, term95261.getClass(), "componentType", term95381);
        setField(term95141, term95141.getClass(), "componentType", term95261);
        setField(term95021, term95021.getClass(), "componentType", term95141);
        setField(term94901, term94901.getClass(), "componentType", term95021);
        setField(term94781, term94781.getClass(), "componentType", term94901);
        setField(term94661, term94661.getClass(), "componentType", term94781);
        setField(term94541, term94541.getClass(), "componentType", term94661);
        setField(term94421, term94421.getClass(), "componentType", term94541);
        setField(term94301, term94301.getClass(), "componentType", term94421);
        setField(term94181, term94181.getClass(), "componentType", term94301);
        setField(term94061, term94061.getClass(), "componentType", term94181);
        setField(term93941, term93941.getClass(), "componentType", term94061);
        setField(term93821, term93821.getClass(), "componentType", term93941);
        setField(term93701, term93701.getClass(), "componentType", term93821);
        setField(term93581, term93581.getClass(), "componentType", term93701);
        setField(term93461, term93461.getClass(), "componentType", term93581);
        setField(term93341, term93341.getClass(), "componentType", term93461);
        setField(term93221, term93221.getClass(), "componentType", term93341);
        setField(term93101, term93101.getClass(), "componentType", term93221);
        setField(term92981, term92981.getClass(), "componentType", term93101);
        setField(term92861, term92861.getClass(), "componentType", term92981);
        setField(term92741, term92741.getClass(), "componentType", term92861);
        setField(term92621, term92621.getClass(), "componentType", term92741);
        setField(term92501, term92501.getClass(), "componentType", term92621);
        setField(term92381, term92381.getClass(), "componentType", term92501);
        setField(term92261, term92261.getClass(), "componentType", term92381);
        setField(term92141, term92141.getClass(), "componentType", term92261);
        setField(term92021, term92021.getClass(), "componentType", term92141);
        setField(term91901, term91901.getClass(), "componentType", term92021);
        setField(term91781, term91781.getClass(), "componentType", term91901);
        setField(term91661, term91661.getClass(), "componentType", term91781);
        setField(term91541, term91541.getClass(), "componentType", term91661);
        setField(term91421, term91421.getClass(), "componentType", term91541);
        term103367 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term103368 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term103369 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term103370 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term103371 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term103371, term103371.getClass(), "componentType", null);
        setField(term103370, term103370.getClass(), "componentType", term103371);
        setField(term103369, term103369.getClass(), "componentType", term103370);
        setField(term103368, term103368.getClass(), "componentType", term103369);
        setField(term103367, term103367.getClass(), "componentType", term103368);
        term103362 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term103363 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term103364 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term103365 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        Object term103366 = newInstance(Class.forName("com.google.gson.internal.$Gson$Types$GenericArrayTypeImpl"));
        setField(term103366, term103366.getClass(), "componentType", null);
        setField(term103365, term103365.getClass(), "componentType", term103366);
        setField(term103364, term103364.getClass(), "componentType", term103365);
        setField(term103363, term103363.getClass(), "componentType", term103364);
        setField(term103362, term103362.getClass(), "componentType", term103363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.$Gson$Types");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.reflect.Type");
        argTypes[1] = Class.forName("java.lang.Class");
        argTypes[2] = Class.forName("java.lang.reflect.Type");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term91421;
        Object retValue = callMethod(klass, "resolve", argTypes, null, args);
        assertTrue(recursiveEquals(term91421, term103367));
        assertTrue(recursiveEquals(retValue, term103362));
    }

};


