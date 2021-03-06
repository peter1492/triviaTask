// Generated by Dagger (https://dagger.dev).
package com.trivia.kotlin.appscriptask;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.trivia.kotlin.appscriptask.database.SummaryDao;
import com.trivia.kotlin.appscriptask.database.SummaryDatabase;
import com.trivia.kotlin.appscriptask.di.AppModule;
import com.trivia.kotlin.appscriptask.di.AppModule_ProvideDatabaseFactory;
import com.trivia.kotlin.appscriptask.di.AppModule_ProvideSummaryDaoFactory;
import com.trivia.kotlin.appscriptask.repository.GameOverRepository;
import com.trivia.kotlin.appscriptask.repository.HistoryRepository;
import com.trivia.kotlin.appscriptask.ui.screens.FragmentGameOver;
import com.trivia.kotlin.appscriptask.ui.screens.FragmentHistory;
import com.trivia.kotlin.appscriptask.ui.screens.FragmentSplash;
import com.trivia.kotlin.appscriptask.ui.screens.MainActivity;
import com.trivia.kotlin.appscriptask.view_models.GameOverViewModel;
import com.trivia.kotlin.appscriptask.view_models.GameOverViewModel_HiltModules_KeyModule_ProvideFactory;
import com.trivia.kotlin.appscriptask.view_models.HistoryViewModel;
import com.trivia.kotlin.appscriptask.view_models.HistoryViewModel_HiltModules_KeyModule_ProvideFactory;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMyApp_HiltComponents_SingletonC extends MyApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object summaryDatabase = new MemoizedSentinel();

  private volatile Object gameOverRepository = new MemoizedSentinel();

  private volatile Object historyRepository = new MemoizedSentinel();

  private DaggerMyApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private SummaryDatabase summaryDatabase() {
    Object local = summaryDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = summaryDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          summaryDatabase = DoubleCheck.reentrantCheck(summaryDatabase, local);
        }
      }
    }
    return (SummaryDatabase) local;
  }

  private SummaryDao summaryDao() {
    return AppModule_ProvideSummaryDaoFactory.provideSummaryDao(summaryDatabase());
  }

  private GameOverRepository gameOverRepository() {
    Object local = gameOverRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gameOverRepository;
        if (local instanceof MemoizedSentinel) {
          local = new GameOverRepository(summaryDao());
          gameOverRepository = DoubleCheck.reentrantCheck(gameOverRepository, local);
        }
      }
    }
    return (GameOverRepository) local;
  }

  private HistoryRepository historyRepository() {
    Object local = historyRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = historyRepository;
        if (local instanceof MemoizedSentinel) {
          local = new HistoryRepository(summaryDao());
          historyRepository = DoubleCheck.reentrantCheck(historyRepository, local);
        }
      }
    }
    return (HistoryRepository) local;
  }

  @Override
  public void injectMyApp(MyApp myApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public MyApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMyApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApp_HiltComponents.ActivityRetainedC {
    private volatile Object lifecycle = new MemoizedSentinel();

    private ActivityRetainedCImpl() {

    }

    private Object lifecycle() {
      Object local = lifecycle;
      if (local instanceof MemoizedSentinel) {
        synchronized (local) {
          local = lifecycle;
          if (local instanceof MemoizedSentinel) {
            local = ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
            lifecycle = DoubleCheck.reentrantCheck(lifecycle, local);
          }
        }
      }
      return (Object) local;
    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    @Override
    public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
      return (ActivityRetainedLifecycle) lifecycle();
    }

    private final class ActivityCBuilder implements MyApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MyApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApp_HiltComponents.ActivityC {
      private ActivityCImpl(Activity activity) {

      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
        return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApp_HiltComponents_SingletonC.this.applicationContextModule), getViewModelKeys(), new ViewModelCBuilder());
      }

      @Override
      public Set<String> getViewModelKeys() {
        return SetBuilder.<String>newSetBuilder(2).add(GameOverViewModel_HiltModules_KeyModule_ProvideFactory.provide()).add(HistoryViewModel_HiltModules_KeyModule_ProvideFactory.provide()).build();
      }

      @Override
      public ViewModelComponentBuilder getViewModelComponentBuilder() {
        return new ViewModelCBuilder();
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MyApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MyApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCI(fragment);
        }
      }

      private final class FragmentCI extends MyApp_HiltComponents.FragmentC {
        private FragmentCI(Fragment fragment) {

        }

        @Override
        public void injectFragmentGameOver(FragmentGameOver fragmentGameOver) {
        }

        @Override
        public void injectFragmentHistory(FragmentHistory fragmentHistory) {
        }

        @Override
        public void injectFragmentSplash(FragmentSplash fragmentSplash) {
        }

        @Override
        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
          return ActivityCImpl.this.getHiltInternalFactoryFactory();
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MyApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MyApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCI(view);
          }
        }

        private final class ViewWithFragmentCI extends MyApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCI(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MyApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCI(view);
        }
      }

      private final class ViewCI extends MyApp_HiltComponents.ViewC {
        private ViewCI(View view) {

        }
      }
    }

    private final class ViewModelCBuilder implements MyApp_HiltComponents.ViewModelC.Builder {
      private SavedStateHandle savedStateHandle;

      @Override
      public ViewModelCBuilder savedStateHandle(SavedStateHandle handle) {
        this.savedStateHandle = Preconditions.checkNotNull(handle);
        return this;
      }

      @Override
      public MyApp_HiltComponents.ViewModelC build() {
        Preconditions.checkBuilderRequirement(savedStateHandle, SavedStateHandle.class);
        return new ViewModelCImpl(savedStateHandle);
      }
    }

    private final class ViewModelCImpl extends MyApp_HiltComponents.ViewModelC {
      private volatile Provider<GameOverViewModel> gameOverViewModelProvider;

      private volatile Provider<HistoryViewModel> historyViewModelProvider;

      private ViewModelCImpl(SavedStateHandle savedStateHandle) {

      }

      private GameOverViewModel gameOverViewModel() {
        return new GameOverViewModel(DaggerMyApp_HiltComponents_SingletonC.this.gameOverRepository());
      }

      private Provider<GameOverViewModel> gameOverViewModelProvider() {
        Object local = gameOverViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          gameOverViewModelProvider = (Provider<GameOverViewModel>) local;
        }
        return (Provider<GameOverViewModel>) local;
      }

      private HistoryViewModel historyViewModel() {
        return new HistoryViewModel(DaggerMyApp_HiltComponents_SingletonC.this.historyRepository());
      }

      private Provider<HistoryViewModel> historyViewModelProvider() {
        Object local = historyViewModelProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          historyViewModelProvider = (Provider<HistoryViewModel>) local;
        }
        return (Provider<HistoryViewModel>) local;
      }

      @Override
      public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
        return MapBuilder.<String, Provider<ViewModel>>newMapBuilder(2).put("com.trivia.kotlin.appscriptask.view_models.GameOverViewModel", (Provider) gameOverViewModelProvider()).put("com.trivia.kotlin.appscriptask.view_models.HistoryViewModel", (Provider) historyViewModelProvider()).build();
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.trivia.kotlin.appscriptask.view_models.GameOverViewModel 
            return (T) ViewModelCImpl.this.gameOverViewModel();

            case 1: // com.trivia.kotlin.appscriptask.view_models.HistoryViewModel 
            return (T) ViewModelCImpl.this.historyViewModel();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
