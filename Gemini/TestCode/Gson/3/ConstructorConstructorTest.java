package com.google.gson.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;

public class ConstructorConstructorTest {

  private Map<Type, InstanceCreator<?>> instanceCreators;
  private ConstructorConstructor constructorConstructor;

  @Before
  public void setUp() {
    instanceCreators = new HashMap<Type, InstanceCreator<?>>();
    constructorConstructor = new ConstructorConstructor(instanceCreators);
  }

  @Test
  public void testToString_emptyMap_returnsMapString() {
    assertEquals(instanceCreators.toString(), constructorConstructor.toString());
  }

  @Test
  public void testGet_instanceCreatorExactTypeMatch_returnsInstanceCreatorResult() {
    Type type = new TypeToken<List<String>>() {}.getType();
    final List<String> expectedList = new LinkedList<String>();
    instanceCreators.put(type, new InstanceCreator<List<String>>() {
      @Override
      public List<String> createInstance(Type t) {
        return expectedList;
      }
    });

    ObjectConstructor<List<String>> constructor = constructorConstructor.get(new TypeToken<List<String>>() {});
    List<String> actual = constructor.construct();
    assertTrue(actual == expectedList);
  }

  @Test
  public void testGet_instanceCreatorRawTypeMatch_returnsInstanceCreatorResult() {
    final List<String> expectedList = new LinkedList<String>();
    instanceCreators.put(List.class, new InstanceCreator<List<String>>() {
      @Override
      public List<String> createInstance(Type t) {
        return expectedList;
      }
    });

    ObjectConstructor<List<String>> constructor = constructorConstructor.get(new TypeToken<List<String>>() {});
    List<String> actual = constructor.construct();
    assertTrue(actual == expectedList);
  }

  public static class PublicClass {
    public PublicClass() {}
  }

  @Test
  public void testGet_defaultPublicConstructor_constructsInstance() {
    ObjectConstructor<PublicClass> constructor = constructorConstructor.get(TypeToken.get(PublicClass.class));
    PublicClass instance = constructor.construct();
    assertNotNull(instance);
  }

  public static class PrivateConstructorClass {
    private PrivateConstructorClass() {}
  }

  @Test
  public void testGet_defaultPrivateConstructor_makesAccessibleAndConstructs() {
    ObjectConstructor<PrivateConstructorClass> constructor =
        constructorConstructor.get(TypeToken.get(PrivateConstructorClass.class));
    PrivateConstructorClass instance = constructor.construct();
    assertNotNull(instance);
  }

  public abstract static class AbstractClassWithNoArgsConstructor {
    public AbstractClassWithNoArgsConstructor() {}
  }

  @Test
  public void testGet_defaultConstructor_instantiationException_wrappedInRuntimeException() {
    ObjectConstructor<AbstractClassWithNoArgsConstructor> constructor =
        constructorConstructor.get(TypeToken.get(AbstractClassWithNoArgsConstructor.class));
    try {
      constructor.construct();
      fail("Expected RuntimeException due to InstantiationException");
    } catch (RuntimeException e) {
      assertTrue(e.getMessage().contains("Failed to invoke"));
    }
  }

  public static class ThrowingConstructorClass {
    public ThrowingConstructorClass() {
      throw new IllegalStateException("Constructor error");
    }
  }

  @Test
  public void testGet_defaultConstructor_invocationTargetException_wrappedInRuntimeException() {
    ObjectConstructor<ThrowingConstructorClass> constructor =
        constructorConstructor.get(TypeToken.get(ThrowingConstructorClass.class));
    try {
      constructor.construct();
      fail("Expected RuntimeException due to InvocationTargetException");
    } catch (RuntimeException e) {
      assertTrue(e.getMessage().contains("Failed to invoke"));
      assertEquals(IllegalStateException.class, e.getCause().getClass());
    }
  }

  @Test
  public void testGet_sortedSet_returnsTreeSet() {
    ObjectConstructor<SortedSet<String>> constructor =
        constructorConstructor.get(new TypeToken<SortedSet<String>>() {});
    SortedSet<String> set = constructor.construct();
    assertTrue(set instanceof TreeSet);
  }

  private enum TestEnum {
    FIRST, SECOND
  }

  @Test
  public void testGet_enumSet_parameterizedWithClass_returnsEnumSet() {
    ObjectConstructor<EnumSet<TestEnum>> constructor =
        constructorConstructor.get(new TypeToken<EnumSet<TestEnum>>() {});
    EnumSet<TestEnum> set = constructor.construct();
    assertNotNull(set);
    assertTrue(set.isEmpty());
  }

  @Test
  public void testGet_enumSet_rawType_throwsJsonIOException() {
    @SuppressWarnings("rawtypes")
    ObjectConstructor<EnumSet> constructor = constructorConstructor.get(TypeToken.get(EnumSet.class));
    try {
      constructor.construct();
      fail("Expected JsonIOException for raw EnumSet");
    } catch (JsonIOException expected) {
      assertTrue(expected.getMessage().contains("Invalid EnumSet type"));
    }
  }

  @Test
  public void testGet_enumSet_typeArgumentNotClass_throwsJsonIOException() {
    final Type fakeType = new ParameterizedType() {
      @Override
      public Type[] getActualTypeArguments() {
        return new Type[] { new Type() {} };
      }

      @Override
      public Type getRawType() {
        return EnumSet.class;
      }

      @Override
      public Type getOwnerType() {
        return null;
      }
    };

    @SuppressWarnings("unchecked")
    TypeToken<EnumSet<TestEnum>> typeToken = (TypeToken<EnumSet<TestEnum>>) TypeToken.get(fakeType);
    ObjectConstructor<EnumSet<TestEnum>> constructor = constructorConstructor.get(typeToken);
    try {
      constructor.construct();
      fail("Expected JsonIOException when EnumSet type argument is not a Class");
    } catch (JsonIOException expected) {
      assertTrue(expected.getMessage().contains("Invalid EnumSet type"));
    }
  }

  @Test
  public void testGet_set_returnsLinkedHashSet() {
    ObjectConstructor<Set<String>> constructor =
        constructorConstructor.get(new TypeToken<Set<String>>() {});
    Set<String> set = constructor.construct();
    assertTrue(set instanceof LinkedHashSet);
  }

  @Test
  public void testGet_queue_returnsLinkedList() {
    ObjectConstructor<Queue<String>> constructor =
        constructorConstructor.get(new TypeToken<Queue<String>>() {});
    Queue<String> queue = constructor.construct();
    assertTrue(queue instanceof LinkedList);
  }

  @Test
  public void testGet_collection_returnsArrayList() {
    ObjectConstructor<Collection<String>> constructor =
        constructorConstructor.get(new TypeToken<Collection<String>>() {});
    Collection<String> collection = constructor.construct();
    assertTrue(collection instanceof ArrayList);
  }

  @Test
  public void testGet_list_returnsArrayList() {
    ObjectConstructor<List<String>> constructor =
        constructorConstructor.get(new TypeToken<List<String>>() {});
    List<String> list = constructor.construct();
    assertTrue(list instanceof ArrayList);
  }

  @Test
  public void testGet_sortedMap_returnsTreeMap() {
    ObjectConstructor<SortedMap<String, Integer>> constructor =
        constructorConstructor.get(new TypeToken<SortedMap<String, Integer>>() {});
    SortedMap<String, Integer> map = constructor.construct();
    assertTrue(map instanceof TreeMap);
  }

  @Test
  public void testGet_mapWithNonStringKey_returnsLinkedHashMap() {
    ObjectConstructor<Map<Integer, String>> constructor =
        constructorConstructor.get(new TypeToken<Map<Integer, String>>() {});
    Map<Integer, String> map = constructor.construct();
    assertTrue(map instanceof LinkedHashMap);
  }

  @Test
  public void testGet_mapWithStringKey_returnsLinkedTreeMap() {
    ObjectConstructor<Map<String, Object>> constructor =
        constructorConstructor.get(new TypeToken<Map<String, Object>>() {});
    Map<String, Object> map = constructor.construct();
    assertTrue(map instanceof LinkedTreeMap);
  }

  @Test
  public void testGet_rawMap_returnsLinkedTreeMap() {
    @SuppressWarnings("rawtypes")
    ObjectConstructor<Map> constructor = constructorConstructor.get(TypeToken.get(Map.class));
    @SuppressWarnings("rawtypes")
    Map map = constructor.construct();
    assertTrue(map instanceof LinkedTreeMap);
  }

  public static class NoNoArgsConstructor {
    public final int value;

    public NoNoArgsConstructor(int value) {
      this.value = value;
    }
  }

  @Test
  public void testGet_noDefaultConstructor_usesUnsafeAllocator() {
    ObjectConstructor<NoNoArgsConstructor> constructor =
        constructorConstructor.get(TypeToken.get(NoNoArgsConstructor.class));
    NoNoArgsConstructor instance = constructor.construct();
    assertNotNull(instance);
  }

  private interface UnsupportedInterface {}

  @Test
  public void testGet_unsafeAllocatorFailure_throwsRuntimeException() {
    ObjectConstructor<UnsupportedInterface> constructor =
        constructorConstructor.get(TypeToken.get(UnsupportedInterface.class));
    try {
      constructor.construct();
      fail("Expected RuntimeException when UnsafeAllocator fails on interface");
    } catch (RuntimeException expected) {
      assertTrue(expected.getMessage().contains("Unable to invoke no-args constructor"));
    }
  }
}
